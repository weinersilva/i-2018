package com.weinersilva.integracao;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author Weiner
 * Recebe o nome e o texto como argumento e persiste
 * o arquivo com o nome informado e o texto.
 */
public class Atividade04 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		System.out.println(geraArquivo(args[0], args[1]));
	
	}

	private static String  geraArquivo(String nomeArquivo, String textoArquivo) {
		String retorno = null;
		
		if (nomeArquivo != null && textoArquivo != null) {
			try {
				//cria o arquivo com o primeiro argumento
				FileWriter arquivo = new FileWriter(nomeArquivo);
				//abre o arquivo para escrita de dados
				PrintWriter pwarquivo = new PrintWriter(arquivo);
				//persiste o texto do segundo
				pwarquivo.println(textoArquivo);
				//fecha o arquivo
				pwarquivo.close();
				retorno = "Arquivo gerado com sucesso!";
			}catch(IOException e) {
				System.out.println(e.getMessage());
				retorno = "Arquivo não foi gerado.";
			}
		}
		
		return retorno;
				
	}

}
