package concursantes;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("mago")
@Aspect
public class Mago implements IAdivinador {

	private String pensamientos;
	
	
	@Pointcut("execution (* concursantes.IPensador.pensarEnAlgo(String)) && args(pensamientos)")
	public void pensar(String pensamientos) {
		System.out.println("Into pointcut "+pensamientos);
	}
	
	@Before("pensar(pensamientos)")
	@Override
	public void interceptaPensamientos(String pensamientos) {
		System.out.println("Magia ...");
		System.out.println("Estos son los pensamientos del voluntario "+pensamientos);
		this.pensamientos=pensamientos;
	}

	@Override
	public String getPensamientos() {
		return this.pensamientos;
	}

	public void setPensamientos(String pensamientos) {
		this.pensamientos = pensamientos;
	}
}
