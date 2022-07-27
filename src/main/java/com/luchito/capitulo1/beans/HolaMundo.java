package com.luchito.capitulo1.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("holaMundoBean")
public class HolaMundo {
	
	@Value("Alumnos desde anotaciones")
	private String nombre;
	
	public void saludar() {
		System.out.println("Saludando desde Spring XML " + nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
