package com.weinersilva.integracao;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Weiner
 * Verifica se o arquivo é um arquivo JPEG
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
	 * Método para verificação de um arquivo, lendo os primeiro par de Bytes e o ultimo par de Bytes do arquivo,
	 * Comparando com FFD8 e FFD9 se for iguais o arquivo é um JPEG.
	 * @param arquivo String com o nome do arquivo repassado para verificação.
	 * @return String se é ou não é JPEG
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
			System.out.println("Arquivo não existe.");
		
		
		//Ler os Bytes do arquivo
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		byte primeiro = dis.readByte();
		byte segundo = dis.readByte();
		
		dis.skip(tamanho-4);
		
		byte penultimo = dis.readByte();
		byte ultimo = dis.readByte();
		
		dis.close();
		
		// faz a comparação dos Bytes para verificar se é um JPEG
		
		if ((primeiro == (byte) 0xFF) &&  (segundo == (byte) 0xD8) 
			 && (penultimo == (byte) 0xFF) && (ultimo == (byte) 0xD9)) {
			return "O arquivo é um JPEG.";
		}else {
		    return "O arquivo não é um JPEG.";
		}
	}

}
