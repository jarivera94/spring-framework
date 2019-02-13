package concursantes;

import org.springframework.stereotype.Component;

@Component("saxofon")
public class Saxofon implements IInstrumento {

	@Override
	public void tocar() {
		
		System.out.println("bum bum bum");
	}

}
