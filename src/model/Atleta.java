package model;

import java.util.Date;
import java.util.Objects;

public class Atleta {
	
	private String dni;
	private String nombre;
	private String categoria;
	private Date fechaInscripcion;
	
	public Atleta(String dni, String nombre, String categoria, Date fechaInscripcion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.categoria = categoria;
		this.fechaInscripcion = fechaInscripcion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Atleta [dni=" + dni + ", nombre=" + nombre + ", categoria=" + categoria + ", fechaInscripcion="
				+ fechaInscripcion + "]";
	}
	
	
	
	

}
