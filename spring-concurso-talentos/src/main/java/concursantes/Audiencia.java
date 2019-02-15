package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("audiencia")
@Aspect
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
	
	//@AfterThrowing("exec()")
	public void devolucion() {
		System.out.println("Devuelvan el dinero ...");
	}
	
	@Pointcut("execution(* concursantes.IConcursante.ejecutar(..))")
	public void exec() {
		
	}
	
	@Around("exec()")
	public void monitorearShow(ProceedingJoinPoint joinPoint) {
		try {
			
			System.out.println("El show esta por comenzar, por favor tomen asiento ...");
			System.out.println("apagar celulares ...");
			
			// Tiempo de Inicio 
			long inicio =System.currentTimeMillis();
			//Llama al metodo de negocio (Objetivo)
			joinPoint.proceed();
			Thread.sleep(1000);
			
			//Tiempo final
			long fin = System.currentTimeMillis();
			
			System.out.println("Se acabo el show ..");
			System.out.println("Tiempo de malabarista : "+ (fin-inicio));
			
		} catch (Throwable t) {
			System.out.println("Se devolveran las entradas");
		}
	}
	
}
