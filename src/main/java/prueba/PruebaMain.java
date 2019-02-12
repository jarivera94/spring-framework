package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.BeanHelloWorld;

public class PruebaMain {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory =applicationContext;
		BeanHelloWorld beanHelloWorld =(BeanHelloWorld ) factory.getBean("beanHelloWorld");
		System.out.println(beanHelloWorld.getMensaje());

	}

}
