package prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.IConcursante;

public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IConcursante malabarista = (IConcursante) ctx.getBean("solei");
		malabarista.ejecutar();
		
		
	}
}
