package com.luchito.capitulo1.service;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Service;

@Service
public class AuditoriaAOP {

	public void alertarAntes(JoinPoint jp) {
		System.out.println("Auditoria ANTES del metodo "+ jp.getSignature());
	}
	
	public void alertarDespues(JoinPoint jp) {
		System.out.println("Auditoria DESPUES del metodo "+ jp.getSignature());
	}
	
	public void alertarExcepcion(JoinPoint jp) {
		System.out.println("Auditoria en la EXCEPCION "+ jp.getSignature());
	}
	
}
