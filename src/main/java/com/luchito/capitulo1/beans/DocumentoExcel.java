package com.luchito.capitulo1.beans;

import org.springframework.stereotype.Repository;

@Repository
public class DocumentoExcel implements Imprimible{

	public void iniciar() {
		System.out.println("Iniciando la construcción del bean de EXCEL");
	}
	
	public void destruir() {
		System.out.println("Destruyendo la instancia creada de EXCEL");
	}
	
	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return "Imprimiendo desde un archivo Excel";
	}

}
