package com.weinersilva.integracao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * 
 * @author Weiner
 * Recuperar avatar_url através de uma url, salvando em arquivo, utilizando gson para recuperar a imagem. 
 *
 */
public class Questao07 {

	
	public static void main(String[] args) throws IOException {

		System.out.println(recuperaAvatar(args[0]));

	}

	private static String recuperaAvatar(String urlAvatar) throws IOException {
        try {
			// gera um url com a url informada no argumento
			URL url = new URL(urlAvatar);
			//cria conexão com a url acima
			HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
			//estabelece o metodo de conexão
			conexao.setRequestMethod("GET");
			conexao.connect();
			//armazena num buffer o json da url
			BufferedReader br = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
			//cria uma string pra armazenar o buffer com o json
			StringBuilder sb = new StringBuilder();
			
			String linha = null;
			//percorre todo buffer gravando na string
			while ((linha = br.readLine()) != null) {
				sb.append(linha + "\n");
			}
			//armazena em uma variavel o json obtido
			String resultadoTemp = sb.toString();
			
			//cria um uma instancia para converter uma string em um objeto json para obter as informações desejadas
			
			JsonParser jp = new JsonParser();
			JsonObject jo = jp.parse(resultadoTemp).getAsJsonObject();
			
			//recupera a url da imagem
			String avatar = jo.get("avatar_url").toString().replaceAll("\"", "");
			//recupera o nome do usuario
			String nome = jo.get("login").toString().replaceAll("\"", "");
			
			//cria ume entrada para receber conteudo da url do avatar
			InputStream is = new URL(avatar).openStream();
			//salva o arquivo com o conteudo recebido, com o nome do usuario e a extensão jpeg
			Files.copy(is, Paths.get(nome + ".jpeg"));
			return "A imagem foi salva com sucesso.";
        }catch(IOException e) {
			System.out.println(e.getMessage());
			return "A imagem não foi salva.";
        }
	}

}
