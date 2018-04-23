package com.weinersilva.integracao;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Atividade01 {
	
public static void main(String[] args) throws IOException {
		
		try {
			System.out.println(exibeQuatroBytesEmHexa(args[0]));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static String exibeQuatroBytesEmHexa (String arquivo) throws FileNotFoundException, IOException {
		
		if(arquivo.equals(null)) {
			System.out.println("Nome do arquivo não informado.");
		}
		
		FileInputStream fis = new FileInputStream(arquivo);
		DataInputStream dis = new DataInputStream(fis);
		
		int resultado = dis.readInt();
		
		dis.close();
		
		return Integer.toHexString(resultado) ;
		
	}
}
