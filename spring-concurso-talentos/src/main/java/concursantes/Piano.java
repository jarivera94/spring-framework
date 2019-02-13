package concursantes;

import org.springframework.stereotype.Component;

@Component("piano")
public class Piano implements IInstrumento {

	@Override
	public void tocar() {
		System.out.println("tilin tilin tilin");
	}

}
