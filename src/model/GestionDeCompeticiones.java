package model;

import java.util.ArrayList;
import java.util.List;

public class GestionDeCompeticiones {
	
	private List<Competicion> competiciones = new ArrayList<>();
	
	public List<Competicion> listarCompeticiones() {
		return new ArrayList<Competicion>(competiciones);
	}
	
	public List<Competicion> listarCompeticionesAbiertas() {
		
		List<Competicion> abiertas = new ArrayList<Competicion>();
		for(Competicion c: competiciones) {
			if(c.estaAbierta()) {
				abiertas.add(c);
			}
		}
		return abiertas;
		
	}
	
	public boolean addCompeticion(Competicion c) {
		
		if(competiciones.contains(c)) {
			return false;
		}
			
		competiciones.add(c);
		return true;
	}

}
