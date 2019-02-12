package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Traductor;

public class PruebaBeans {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = context;
		
		Traductor traductorIngles =(Traductor) factory.getBean("traductorIngles");
		traductorIngles.hablar();
		
		Traductor traductorEspanol =(Traductor) factory.getBean("traductorEspanol");
		traductorEspanol.hablar();
		

	}

}
