package test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concursantes.IConcursante;
import concursantes.Malabarista;
import concursantes.Musico;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestConcursoTalentos {
	//private static ApplicationContext ctx;
	//Malabaristas
	@Autowired
	@Qualifier("solei")
	public IConcursante malabarista;
	@Autowired
	@Qualifier("soleiRecitador")
	public IConcursante malabarista2;
	//Musicos
	@Autowired
	@Qualifier("musicoPiano")
	public IConcursante musico1;
	//public IConcursante musico2;
	
	
	private static Log logger = LogFactory.getLog("TestConcursoTalentos"); 
	
	/*@Before
	public void before() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Malabarista
		malabarista = (IConcursante) ctx.getBean("solei");
		malabarista2 = (IConcursante) ctx.getBean("soleiRecitador");
		//Musicos
		musico1= (IConcursante)ctx.getBean("musicoPiano");
		//musico2= (IConcursante)ctx.getBean("musicoSaxofon");
	}*/
	
	@Test
	public void test() {
		logger.info("Inicia el proceso malabaristas");
		int pelotas =5;
		malabarista.ejecutar();
		logger.info("Ejecucion malabarista uno");
		malabarista2.ejecutar();
		logger.info("Ejecucion malabarista dos");
		assertEquals(pelotas, ((Malabarista)malabarista).getPelotas());
		logger.info("Validacion numero de pelotas");
		assertEquals(100, ((Malabarista)malabarista2).getPelotas());
		logger.info("Finalizan los malabaristas");
		
		logger.info("Inicia el proceso musicos");
		
		String cancion ="Noche de Paz";
		musico1.ejecutar();
		assertEquals(cancion, ((Musico)musico1).getCancion());
		//musico2.ejecutar();
		//cancion="Simpatia por el diablo";
		//assertEquals(cancion, ((Musico)musico2).getCancion());
		
	}

}
