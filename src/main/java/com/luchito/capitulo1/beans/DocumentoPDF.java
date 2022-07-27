package com.luchito.capitulo1.beans;

public class DocumentoPDF implements Imprimible{
	
	public void iniciar() {
		System.out.println("Iniciando la construcción del bean de PDF");
	}
	
	public void destruir() {
		System.out.println("Destruyendo la instancia creada de PDF");
	}
	
	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return "Imprimiendo un PDF";
	}

	
}
