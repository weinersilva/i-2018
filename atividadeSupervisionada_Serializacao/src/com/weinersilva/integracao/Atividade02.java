package com.weinersilva.integracao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * @author Weiner 
 * Criar um metodo que serializa e outro que faça o contrario.
 *
 */
public class Atividade02 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//instancia um usuario e seta seus parametros
		Usuario usuario = new Usuario();
		usuario.setNome("Weiner");
		usuario.setSenha("123abc");
		//chama metodo serializa, passando a classe e o nome do arquivo
		serializa(usuario, "Usuario.txt");
		//instancia um novo usuario recebendo a deserialização do arquivo
		Usuario novoUsuario = deserializa("Usuario.txt");
		//imprimindo os dados do novo usuario
		System.out.println(novoUsuario.getNome());
		System.out.println(novoUsuario.getSenha());
	}

	

	private static void serializa(Serializable s, String nomeArquivo) throws IOException {
			//cria um arquivo com o nome informado
			FileOutputStream fos = new FileOutputStream(nomeArquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//escreve o objeto no arquivo
			oos.writeObject(s);
			//fecha o objeto e arquivo
			oos.close();
			fos.close();

	}
	
	private static Usuario deserializa(String nomeArquivo) throws IOException, ClassNotFoundException {
		//faz a leitura do arquivo informado
		FileInputStream fis = new FileInputStream(nomeArquivo);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//instancia um objeto para receber o objeto lido
		Usuario usuario = (Usuario)ois.readObject();
		//fecha o objeto e o arquivo
		ois.close();
		fis.close();
		//retorna o objeto
		return usuario;
	}

}
