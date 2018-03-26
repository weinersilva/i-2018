package atividadeSupervisionadas02;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

	public static void main (String[] args) throws IOException {
		
	 String refJpeg = "FFD8FFD9";
	 String arquivo = "smile.jpeg";
	 String resultado = "";
	 
	 Path path = Paths.get(arquivo);
	 ByteBuffer[] buffer = new ByteBuffer[4];
	 	
	 for(int i=0;i<=3;i++) {
	 		buffer[i] = ByteBuffer.allocate(1);
	 	}
	 	
	 FileChannel fc =  FileChannel.open(path);
	 fc.read(buffer, 0, 2);
	 fc.position(fc.size() - 2);
	 fc.read(buffer, 2, 2);
	 fc.close();
	 
	 for(int i = 0; i <= 3; i++) {
		 resultado += String.format("%02X", buffer[i].get(0));
	 }
	 	 
	 if(resultado.equals(refJpeg)) {
		 System.out.printf("Este arquivo está no formato Jpeg! \n" + "Magic Number: ");
	 }else {
		 System.out.printf("Este arquivo não está no formato Jpeg! \n"+ "Magic Number: ");
	 }
	 
	 System.out.println(resultado);
	}
	 
}
