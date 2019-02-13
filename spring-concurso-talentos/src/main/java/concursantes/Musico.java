package concursantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("musicoPiano")
public class Musico implements IConcursante {
	
	@Value("Noche de Paz")
	private String cancion;
	
	@Autowired
	@Qualifier("piano")
	private  IInstrumento instrumento;
	
	public Musico(String cancion, IInstrumento iInstrumento) {
		super();
		this.cancion = cancion;
		this.instrumento= iInstrumento;
	}
	
	public Musico() {
	
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public IInstrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(IInstrumento instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public void ejecutar() throws ExecutionException {
		System.out.println("esta cantando "+ this.cancion);
		this.instrumento.tocar();
	}

}
