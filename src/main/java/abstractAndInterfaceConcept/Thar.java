package abstractAndInterfaceConcept;

public class Thar implements Car{

	@Override
	public void startCar() {
		System.out.println("Star-----the-----car");
	}

	@Override
	public void stopCar() {
		System.out.println("Stop-----the-----car");
		
	}

	@Override
	public void refuelCar(String refuelName) {
		System.out.println("Refueling-----the----car---with-----"+refuelName);
		
	}
}
