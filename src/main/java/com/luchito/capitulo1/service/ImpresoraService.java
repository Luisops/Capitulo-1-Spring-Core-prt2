package com.luchito.capitulo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.luchito.capitulo1.beans.Imprimible;

@Service("impresoraServiceBean")
public class ImpresoraService {

	@Autowired
	@Qualifier("documentoTexto")
	private Imprimible documento;
	
	//constructor vacio
	public ImpresoraService() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor con campos
	public ImpresoraService(Imprimible documento) {
		this.documento = documento;
	}

	//METODO
	public void imprimirDocumento() {
		System.out.println(documento.imprimir());
	}

	//metodo get and set
	public Imprimible getDocumento() {
		return documento;
	}

	public void setDocumento(Imprimible documento) {
		this.documento = documento;
	}
	
}
