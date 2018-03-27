package atividadeSupervisionadas04;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException,UnsupportedEncodingException {
		
		String arquivo = "novoArquivo.txt";
		
		PrintWriter pw = new PrintWriter(arquivo, "UTF-8" );
		
		Scanner leitura = new Scanner(System.in);
		
		String texto;
		
		System.out.printf("Digite o texto a ser armazenado: ");
		
		texto = leitura.nextLine();
		
		pw.write(texto);
		
		pw.close();
		
		leitura.close();
	}
}
