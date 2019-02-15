package concursantes;

import org.springframework.stereotype.Component;

@Component("audiencia")
public class Audiencia {

	public void sentarse() {
		System.out.println("Por favor tomen asiento ...");
	}
	
	public void apagarCelulares() {
		System.out.println("Por favor apaguen celulares ...");
	}
	
	public void aplaudir() {
		System.out.println("Por favor aplaudan ...");
	}
	
	public void devolucion() {
		System.out.println("Devuelvan el dinero ...");
	}
	
}
