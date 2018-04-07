package atividadeSupervisionadas06;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		String arqBin = "arquivoBin.bin";
		
		FileInputStream fis = new FileInputStream(arqBin);
		
        DataInputStream dis = new DataInputStream(fis);
        
        String retorno = "";
        
        int linha = 1;
        
        while(dis.available() > 0){
            
            int tamanho = dis.readInt();
             
            byte[] buffer = new byte[tamanho];
            
            dis.readFully(buffer, 0, tamanho);
            
            String dados = new String(buffer, "UTF-8");
             
            retorno = retorno +  "Linha: " + linha + " - Tamanho: " + tamanho + " - dados: " + dados + "\n";
            
            linha++;
        }
        
        dis.close();
        System.out.println(retorno);
	}
	
}
