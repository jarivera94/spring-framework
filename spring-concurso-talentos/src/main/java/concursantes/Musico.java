package concursantes;

public class Musico implements IConcursante {

	private String cancion;
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
