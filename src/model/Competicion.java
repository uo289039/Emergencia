package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Competicion {
	
	private String nombre;
	private Tipo tipo;
	private double cuota;
	private double distancia;
	private Date fechaFinInscripcion;
	private Date fechaEvento;
	private List<Atleta> atletasInscritos = new ArrayList<Atleta>();
	
	
	public Competicion(String nombre, Tipo tipo, double cuota, double distancia, Date fechaFinInscripcion,
					   Date fechaEvento) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.cuota = cuota;
		this.distancia = distancia;
		this.fechaFinInscripcion = fechaFinInscripcion;
		this.fechaEvento = fechaEvento;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public double getCuota() {
		return cuota;
	}
	
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public Date getFechaFinInscripcion() {
		return fechaFinInscripcion;
	}
	
	public void setFechaFinInscripcion(Date fechaFinInscripcion) {
		this.fechaFinInscripcion = fechaFinInscripcion;
	}
	
	public Date getFechaEvento() {
		return fechaEvento;
	}
	
	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	
	public List<Atleta> getAtletasInscritos() {
		return new ArrayList<Atleta>(atletasInscritos);
	}
	
	public boolean addAtleta(Atleta a) {
		
		if(!estaInscrito(a)) {
			atletasInscritos.add(a);
			return true;
		}
		
		return false;
		
	}
	
	private boolean estaInscrito(Atleta elAtleta) {
		
		for(Atleta a: atletasInscritos) {
			if(elAtleta.equals(a)) return true;
		}
		
		return false;
		
	}
	
	public boolean estaAbierta() {
		
		Calendar calendarioFin = Calendar.getInstance();
        calendarioFin.setTime(fechaFinInscripcion);
        
        Calendar calendarioAhora = Calendar.getInstance();
        calendarioAhora.setTime(new Date());
        
        long diferenciaEnMilisegundos = calendarioAhora.getTimeInMillis() - calendarioFin.getTimeInMillis();
        
        return diferenciaEnMilisegundos > 0;
        
	}

	@Override
	public String toString() {
		return "Competicion [nombre=" + nombre + ", tipo=" + tipo + ", cuota=" + cuota + ", distancia=" + distancia
				+ ", fechaFinInscripcion=" + fechaFinInscripcion + ", fechaEvento=" + fechaEvento + "]";
	}
	
	
	
	
	

}
