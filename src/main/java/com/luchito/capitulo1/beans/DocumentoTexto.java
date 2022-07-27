package com.luchito.capitulo1.beans;

import org.springframework.stereotype.Controller;

@Controller
public class DocumentoTexto implements Imprimible{

	public void iniciar() {
		System.out.println("Iniciando la construcción del bean de TEXTO");
	}
	
	public void destruir() {
		System.out.println("Destruyendo la instancia creada de TEXTO");
	}
	
	@Override
	public String imprimir() {
		String abc = null;
		abc.getBytes();
		return "Imprimiendo desde un archivo de texto";
	}

}
