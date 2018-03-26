package manipuladorDeArquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class ManipulaArquivos {

	public static boolean CriaArquivo(String Caminho, String Texto) {
		try {
			FileWriter arquivo = new FileWriter(Caminho);
			PrintWriter pwarquivo = new PrintWriter(arquivo);
			pwarquivo.println(Texto);
			pwarquivo.close();
			return true;
		}catch(IOException e){
			System.out.println(e.getMessage());
			return false;	
		}
	}
	
	
	public static String LerArquivo(String Caminho) {
		String conteudo ="";
		try {
			FileReader arquivo = new FileReader(Caminho);
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			String linha = "";
			try {
				linha = lerArquivo.readLine();
				while(linha!=null) {
					conteudo += linha + "\n";
					linha = lerArquivo.readLine();
				}
				arquivo.close();
				return conteudo;
			}catch (IOException ex) {
				System.out.println("Não foi possivel ler o arquivo!");
				return "";
			}
		}catch(FileNotFoundException ex) {
			System.out.println("Arquivo não encontrado!");
			return "";
		}
	}
}
