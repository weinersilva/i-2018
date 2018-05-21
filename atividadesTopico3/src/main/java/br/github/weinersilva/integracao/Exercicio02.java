package br.github.weinersilva.integracao;


import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.github.weinersilva.integracao.repositorio.Calcados;

public class Exercicio02 {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		JAXBContext context = JAXBContext.newInstance(Calcados.class);
		
		Unmarshaller un = context.createUnmarshaller();
		
		Calcados calcados = (Calcados)un.unmarshal(new FileReader(args[0]));
		
		System.out.println(calcados.getTenis().toString());
		System.out.println(calcados.getSapato().toString());
	}
	
}
