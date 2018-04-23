package com.weinersilva.integracao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author Weiner
 * Recebe um arquivo como paramêtro e faz a leitura na saída padrão.
 */
public class Atividade03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String linha;
		//carrega o arquivo informado
		FileInputStream fis = new FileInputStream(args[0]);
		InputStreamReader isr = new InputStreamReader(fis);
		
		//lê o arquivo em buffer
		BufferedReader br = new BufferedReader(isr);
		
		//percorre o buffer imprimindo o conteúdo.
		while((linha = br.readLine()) != null) {
			System.out.println(linha);
		}
		//fecha o buffer
		br.close();

	}

}
