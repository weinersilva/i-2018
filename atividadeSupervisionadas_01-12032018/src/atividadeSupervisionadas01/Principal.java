package atividadeSupervisionadas01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		String arquivo = "Principal.class";
		
		FileInputStream fis = new FileInputStream(arquivo);
		DataInputStream dis = new DataInputStream(fis);
		
		int resultado = dis.readInt();
		
		dis.close();
		
		System.out.println(Integer.toHexString(resultado));
		
	}
}