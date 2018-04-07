package atividadeSupervisionadas05;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		
		String arqTexto = "arquivoTexto.txt";
		String arqBin = "arquivoBin.bin";
		
		FileInputStream fis = new FileInputStream(arqTexto);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream(arqBin);
		DataOutputStream dos = new DataOutputStream(fos);
				
		String linha;
		
		while((linha = br.readLine())!= null) {
			
			byte[] linhaBytes = linha.getBytes("UTF-8");
			
			dos.writeInt(linhaBytes.length);
			
			dos.write(linhaBytes, 0, linha.length());
			
		}
		
		br.close();
		
		dos.close();
		
		
	}

}
