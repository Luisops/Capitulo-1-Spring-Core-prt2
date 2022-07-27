package com.luchito.capitulo1.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luchito.capitulo1.service.ImpresoraService;

public class Ejecutar {

	public static void main(String[] args) {
		/*CON XML*/
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml"); 
		/*CON ANOTACIONES*/
		
		//ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		HolaMundo hm = (HolaMundo) contexto.getBean("holaMundoBean");
		hm.saludar();
		HolaMundo hm2 = (HolaMundo) contexto.getBean("holaMundoBean");
		System.out.println("Compara posiciones de memoria = "+hm+" - "+hm2);
		hm2.setNombre("Segundo nombre");
		System.out.println("Valor del nombre primer bean = "+hm.getNombre());
		
		ImpresoraService sv = (ImpresoraService) contexto.getBean("impresoraServiceBean");
		sv.imprimirDocumento();
		
		((ConfigurableApplicationContext)contexto).close();
		
	}
}
