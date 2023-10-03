package ui.console;
import java.util.Date;

import model.Atleta;
import model.Competicion;
import model.GestionDeCompeticiones;
import model.Tipo;

/**
 * Pequeña prueba para probar que funciona por consola.
 * 
 * @author enolmontesoto
 *
 */
public class Console {
	
	private GestionDeCompeticiones gDC = new GestionDeCompeticiones();
	
	public void run() {
		
		@SuppressWarnings("deprecation")
		Atleta a = new Atleta("Usain Bolt", "12345678B", "H", "Correr", new Date(), new Date(1985, 11, 17));
		Competicion c = new Competicion("Carrera Anual Laciana", Tipo.MONTANA, 5, 5.5, new Date(), new Date());
		
		@SuppressWarnings("deprecation")
		Atleta a2 = new Atleta("José Luis Perales", "12345679P", "H",  "Correr", new Date(),  new Date(1992, 07, 24));
		Competicion c2 = new Competicion("Vuelta A Albacete", Tipo.RUTA, 10, 15, new Date(), new Date());
		
		c.addAtleta(a);
		c2.addAtleta(a);
		gDC.addCompeticion(c);
		
		c.addAtleta(a2);
		c2.addAtleta(a2);
		gDC.addCompeticion(c2);
		
		showCompeticionesAbiertas();
		
	}
	
	public void showCompeticiones() {
		for(Competicion c: gDC.listarCompeticiones()) {
			System.out.println(c.toString());
			for(Atleta a: c.getAtletasInscritos()) {
				System.out.println("  -> " + a.toString());
			}
		}
	}
	
	public void showCompeticionesAbiertas() {
		for(Competicion c: gDC.listarCompeticionesAbiertas()) {
			System.out.println(c.toString());
			for(Atleta a: c.getAtletasInscritos()) {
				System.out.println("  -> " + a.toString());
			}	
		}
	}

}
