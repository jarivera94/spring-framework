package concursantes;

import org.springframework.stereotype.Component;

@Component("voluntario")
public class Voluntario implements IPensador {

	private String pensamientos;
	@Override
	public void pensarEnAlgo(String pensamientos) {
		System.out.println("Estoy pensadndo en "+pensamientos);

	}
	public String getPensamientos() {
		return pensamientos;
	}
	public void setPensamientos(String pensamientos) {
		this.pensamientos = pensamientos;
	}


}
