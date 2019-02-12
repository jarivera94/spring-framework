package beans;

public class InterpreteIngles implements IInterprete {

	@Override
	public void saludar() {
		System.out.println("Hello mi name is ...");
		
	}

	@Override
	public void despedirse() {
		System.out.println("Bye bye ...");
	}

}
