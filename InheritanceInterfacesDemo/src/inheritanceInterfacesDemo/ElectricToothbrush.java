package inheritanceInterfacesDemo;


//the extends keyword creates a parent/child relationship between electricToothbrush and Toothbrush
//the implements keyword connect shared behavior of objects to the interface that denotes it
public class ElectricToothbrush extends Toothbrush implements USBChargeable {
	
	@Override
	public void brush() {
		System.out.println("Spinning bristles");
	}
	
	@Override
	public void charge(double amps) {
		System.out.println("Charging the brush");
	}

}
