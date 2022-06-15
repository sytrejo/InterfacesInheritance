package inheritanceInterfacesDemo;

public class USBCharger {
	
	private double amps = 40.0;
	
	public void charge(USBChargeable chargeable) {
		chargeable.charge(amps);
	}

}
