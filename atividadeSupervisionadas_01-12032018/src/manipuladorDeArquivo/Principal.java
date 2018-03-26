package manipuladorDeArquivo;

public class Principal {

	public static void main(String[] args) {

		String caminho = "arquivo.txt";
		
		//GRAVA ARQUIVO
		String texto = "Visão geral - INTEGRAÇÃO DE APLICAÇÕES\r\n" + 
				"A disciplina é de natureza prática e concentra-se em aspectos técnicos relevantes para a\r\n" + 
				"integração de aplicações, que é um tópico corrente e típico de organizações que produzem\r\n" + 
				"e fazem uso de software. A aprovação nessa disciplina exige a identificação de um\r\n" + 
				"problema e o posterior desenvolvimento (atividade prática de integração), ambos\r\n" + 
				"acompanhadas em todas as aulas pelo docente. Veja avaliação abaixo para detalhes.";

		
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
