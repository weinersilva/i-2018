package br.github.weinersilva.integracao;

import static org.junit.Assert.*;

import java.io.IOException;
import javax.xml.transform.TransformerConfigurationException;

import org.junit.Test;
import org.w3c.dom.DOMException;

import junit.framework.Assert;

public class Exercicio01Test {

	
	
	
	@Test
	public void testArquivoConvertido() throws TransformerConfigurationException, DOMException, IOException {
		
		String arquivo = "arquivo.csv";
		assertNotNull(Exercicio01.converteXml(arquivo));
		
	}
	

}
