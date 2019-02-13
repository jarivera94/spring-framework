package concursantes;

import org.springframework.stereotype.Component;

@Component("solei")
public class Malabarista implements IConcursante{

	private int pelotas = 5;
	
	public Malabarista() {
	
	}

	public Malabarista(int pelotas) {
		super();
		this.pelotas = pelotas;
	}
	
	

	public int getPelotas() {
		return pelotas;
	}

	public void setPelotas(int pelotas) {
		this.pelotas = pelotas;
	}

	@Override
	public void ejecutar() throws ExecutionException {
		
		System.out.println("Malabares "+this.pelotas+ " pelotas");
	}
	
}
