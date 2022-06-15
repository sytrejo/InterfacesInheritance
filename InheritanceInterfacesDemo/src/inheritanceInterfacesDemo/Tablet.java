package inheritanceInterfacesDemo;

public class Tablet implements USBChargeable {
	
	@Override
	public void charge(double amps) {
		System.out.println("Direct power into batteries and brighten screen");
	}

}
