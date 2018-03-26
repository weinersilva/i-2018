package manipuladorDeArquivo;

public class Principal {

	public static void main(String[] args) {

		String caminho = "arquivo.txt";
		
		//GRAVA ARQUIVO
		String texto = "Vis�o geral - INTEGRA��O DE APLICA��ES\r\n" + 
				"A disciplina � de natureza pr�tica e concentra-se em aspectos t�cnicos relevantes para a\r\n" + 
				"integra��o de aplica��es, que � um t�pico corrente e t�pico de organiza��es que produzem\r\n" + 
				"e fazem uso de software. A aprova��o nessa disciplina exige a identifica��o de um\r\n" + 
				"problema e o posterior desenvolvimento (atividade pr�tica de integra��o), ambos\r\n" + 
				"acompanhadas em todas as aulas pelo docente. Veja avalia��o abaixo para detalhes.";

		
		if (ManipulaArquivos.CriaArquivo(caminho, texto))
			System.out.println("Arquivo criado com sucesso!");
		else
			System.out.println("Erro ao criar arquivo!");
		
		//LEITURA DO ARQUIVO
		/*String leitura= ManipulaArquivos.LerArquivo(caminho);
		if(leitura.isEmpty())
			System.out.println("Arquivo vazio!");
		else
			System.out.println(leitura);*/
		
	}

}
