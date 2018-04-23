package com.weinersilva.integracao;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Weiner
 * Verifica se o arquivo � um arquivo JPEG
 */
public class Atividade02 {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			System.out.println(verificaArquivo(args[0]));
		}catch(IOException e) {
			System.out.println(e);
		}

	}

	/**
	 * M�todo para verifica��o de um arquivo, lendo os primeiro par de Bytes e o ultimo par de Bytes do arquivo,
	 * Comparando com FFD8 e FFD9 se for iguais o arquivo � um JPEG.
	 * @param arquivo String com o nome do arquivo repassado para verifica��o.
	 * @return String se � ou n�o � JPEG
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static String verificaArquivo(String arquivo) throws FileNotFoundException, IOException{
		
		long tamanho = 0;
		
		//Ler e armazena o tamanho do arquivo
		File file = new File(arquivo);
		if (file.exists())
			tamanho = file.length();
		else
			System.out.println("Arquivo n�o existe.");
		
		
		//Ler os Bytes do arquivo
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		byte primeiro = dis.readByte();
		byte segundo = dis.readByte();
		
		dis.skip(tamanho-4);
		
		byte penultimo = dis.readByte();
		byte ultimo = dis.readByte();
		
		dis.close();
		
		// faz a compara��o dos Bytes para verificar se � um JPEG
		
		if ((primeiro == (byte) 0xFF) &&  (segundo == (byte) 0xD8) 
			 && (penultimo == (byte) 0xFF) && (ultimo == (byte) 0xD9)) {
			return "O arquivo � um JPEG.";
		}else {
		    return "O arquivo n�o � um JPEG.";
		}
	}

}
