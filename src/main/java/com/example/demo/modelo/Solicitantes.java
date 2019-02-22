package com.example.demo.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Solicitantes")
@Access(AccessType.FIELD)
public class Solicitantes extends ParentEntity {

	private static final long serialVersionUID = -2385633601678800912L;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "fechaViaje", nullable = false, length = 50)
	private String fechaViaje;
	
	@Column(name = "destino", nullable = false, length = 100)
	private String destino;
	 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFechaViaje() {
		return fechaViaje;
	}
	public void setFechaViaje(String fechaViaje) {
		this.fechaViaje = fechaViaje;
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

}
