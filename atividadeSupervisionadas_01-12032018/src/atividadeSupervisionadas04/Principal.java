package atividadeSupervisionadas04;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException,UnsupportedEncodingException {
		PrintWriter pw = new PrintWriter(args[ 0 ], "UTF-8" );
		pw.write(args[ 1 ]);
		pw.close();
	}
}
