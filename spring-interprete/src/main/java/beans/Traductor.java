package beans;

public class Traductor {

	private IInterprete interprete;
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IInterprete getInterprete() {
		return interprete;
	}
	public void setInterprete(IInterprete interprete) {
		this.interprete = interprete;
	}
	
	public void hablar() {
		this.interprete.saludar();
		System.out.println(this.nombre);
		this.interprete.despedirse();
	}
	
}
