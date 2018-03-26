package atividadeSupervisionadas03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws IOException{

		String arquivo = "arquivo.txt";
		String linha;
		FileInputStream fis = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		while((linha = br.readLine()) != null) {
			System.out.println(linha);
		}
		
		br.close();
		
	}
	
	
	
}
