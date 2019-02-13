package test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.IConcursante;
import concursantes.Malabarista;

public class TestConcursoTalentos {
	private static ApplicationContext ctx;
	public IConcursante malabarista;
	
	private static Log logger = LogFactory.getLog("TestConcursoTalentos"); 
	
	@Before
	public void before() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista = (IConcursante) ctx.getBean("solei");
	}
	
	@Test
	public void test() {
		logger.info("Inicia el proceso");
		int pelotas =5;
		malabarista.ejecutar();
		assertEquals(pelotas, ((Malabarista)malabarista).getPelotas());
		logger.info("Fin de la ejecucion");
	}

}
