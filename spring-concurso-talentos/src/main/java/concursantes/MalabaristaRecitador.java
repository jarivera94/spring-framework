package concursantes;

public class MalabaristaRecitador extends Malabarista {


	private IPoema poema;

	public MalabaristaRecitador(IPoema poema) {
		super();
		this.poema = poema;
	}

	public MalabaristaRecitador() {
		super();
	}

	public MalabaristaRecitador(int pelotas, IPoema poema) {
		super(pelotas);
		this.poema=poema;

	}

	public IPoema getPoema() {
		return poema;
	}

	public void setPoema(IPoema poema) {
		this.poema = poema;
	}
	
	@Override
	public void ejecutar() throws ExecutionException {
		
		super.ejecutar();
		System.out.println("Mientras recita ...");
		this.poema.recitar();
		System.out.println("Finaliza la recitacion ...");
		
	}
}
