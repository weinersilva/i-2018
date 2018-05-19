package br.github.weinersilva.integracao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * 
 * @author Weiner Silva
 * Classe que faz a leitura de um arquivo csv, com separador ";" e transforma em arquivo XML
 *
 */
public class Exercicio01 {

	public static void main(String[] args) throws TransformerConfigurationException, DOMException, IOException {
		//Chama método de conversão com arquivo passado como argumento
		System.out.println(converteXml(args[0]));
	
	}

	/**
	 * Método que faz a conversão do CSV para XML
	 * @param arquivoCSV
	 * @return mensagem de sucesso!
	 * @throws TransformerConfigurationException
	 * @throws DOMException
	 * @throws IOException
	 */
	public static String converteXml(String arquivo) throws TransformerConfigurationException, DOMException, IOException {
		//Definição de atributos usados
		String linha = "";
		String separadorCsv = ";";
		BufferedReader br;
		
		try {
			//fabrica que habilita a aplicação obter um parser para construção de documento XML
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//obtem a instancia
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			//faz a leitura do arquivo em buffer
			br = new BufferedReader(new FileReader(arquivo));
			
			//cria um novo documento
			Document doc = db.newDocument();
			//especifica o elemento raiz do doc xml
			Element elementoRaiz = doc.createElement("alunos");
			//acrescenta o elemento raiz no documento
			doc.appendChild(elementoRaiz);
			
			//pula a linha do título
			linha = br.readLine();
			
			//percorre todo documeto fazendo a leitura linha por linha
			while((linha = br.readLine()) != null) {
				
				//especifica o elemento aluno
				Element aluno = doc.createElement("aluno");
				//acrescenta na raiz do documento
				elementoRaiz.appendChild(aluno);
				
				//obtem um array com os dados separados de acordo com o separador informado no atributo
				String[] linhaAluno = linha.split(separadorCsv);
				
				//especifica o elemento do nome
				Element nome = doc.createElement("nome");
				//acrescenta no elemento o nodo do array informado
				nome.appendChild(doc.createTextNode(linhaAluno[0]));
				//acrescenta o elemento nome no elemento aluno
				aluno.appendChild(nome);
				
				//especifica o elemento do email
				Element email = doc.createElement("email");
				//acrescenta no elemento o nodo do array informado
				email.appendChild(doc.createTextNode(linhaAluno[1]));
				//acrescenta o elemento email no elemento aluno
				aluno.appendChild(email);
			
			}
			//fecha o arquivo
			br.close();
			
			//fabrica de transformação DOM para XML
			TransformerFactory tf = TransformerFactory.newInstance();
			//instancia para transformar o doc de elementos em xml
			Transformer transformer = tf.newTransformer();
			// algumas propriedades do transformer (omitir declaração, identar, encoding, metodo, estilo de identação)
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			
			//transforma o documento em um DOM
			DOMSource domSource = new DOMSource(doc);
			
			//especificando o nome do arquivo xml
			String[] nomeArquivo = arquivo.split("\\.");
			
			//nome com extensão
			StreamResult nomeArquivoFinal = new StreamResult(new File(nomeArquivo[0]+".xml"));
			
			//transforma o DOM com o nome do arquivo final
			transformer.transform(domSource, nomeArquivoFinal);
			
			//mensagem de sucesso
			return "Arquivo Convertido!";
			
		}catch(ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		
		//mensagem de falha
		return "Arquivo não foi convertido!";

	}

}
