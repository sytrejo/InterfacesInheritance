package inheritanceInterfacesDemo;


//we can implement multiple interfaces
//separate the multiple interfaces with a comma
//remember classes can only have one parent class 
//but can have multiple parent interfaces
public class PortableLamp implements Chargeable, Lamp {
	
	@Override
	public void produceLight() {
		System.out.println("Shine a nice LED light");
	}
	
	@Override
	public void charge(double amps) {
		System.out.println("Receive power from solar array");
	}

}
