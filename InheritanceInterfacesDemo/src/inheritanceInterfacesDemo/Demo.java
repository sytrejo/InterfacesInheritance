package inheritanceInterfacesDemo;

public class Demo {

	public static void main(String[] args) {
		
		Chargeable chargeable1 = new PortableLamp();
		//We cannot call produceLight() because of the reference type
		//chargeable1.produceLight();
		
		//If we didn't know that chargeable1 was a PortableLamp,
		//We should do an instanceof check before downcasting
		//(The reason we know it we called the constructor above)
		if(chargeable1 instanceof Lamp) {
			Lamp lamp = (Lamp) chargeable1;
			//We can call the lamp method because the variable is of type Lamp
			lamp.produceLight();
		}
		
		//Since Tablet implements Chargeable, we can store a tablet in a chargeable reference
		Chargeable chargeable2 = new Tablet();
		
		//We can also downcast and store the tablet in a USBChargeable reference
		USBChargeable usbChargeable = (USBChargeable) chargeable2;
		
		//We can also downcast and store the tablet in a Tablet reference
		Tablet tablet = (Tablet) chargeable2;
		
		USBCharger usbCharger = new USBCharger();
		
		//the usbCharger's charge() method will accept a usbChargeable reference
		//or a reference of any subtype(like Tablet)
		usbCharger.charge(usbChargeable);
		usbCharger.charge(tablet);
	}
}
