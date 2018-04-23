package com.weinersilva.integracao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * @author Weiner
 * Atividade gera uma exce��o NotSerializableException
 * 
 */
public class Atividade01 {

	public static void main(String[] args) throws IOException {
		//instancia uma classe que nao � serializada
		Cidade cidade = new Cidade("Goi�nia", "GO");
		//instancia uma classe serializada, incluindo a classe nao serializada
		Pessoa pessoa = new Pessoa ("Weiner", "weiner@gmail.com",cidade);
		//chama o m�todo para persistir o arquivo
		armazena(pessoa, "Pessoa.txt");
	}

	private static void armazena(Serializable s, String nomeArquivo) throws IOException {
        //cria o arquivo
		FileOutputStream fos = new FileOutputStream(nomeArquivo);
		//gera o objeto de saida no arquivo
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try {
			// tenta gravar a classe no arquivo.
			oos.writeObject(s);
			
		}catch(IOException e) {
			// como a classe pessoa � serializada ao tentar persistir a classe cidade que n�o �, apresenta o erro notserializableexception
			System.out.println(e);
		
		}
		//fecha os arquivos
		oos.close();
		fos.close();
	}

}
