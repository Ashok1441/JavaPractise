package abstractAndInterfaceConcept;

public class TestTharCar {

	public static void main(String[] args) {
		
		Thar thar=new Thar();
		// we can call variable of interface by using interface class name or can be calle with implementing class name like shown below
		
//		System.out.println("Thar is a "+thar.driveMode+" wheel Drive Car");
		System.out.println("Thar is a "+Car.driveMode+" wheel Drive Car");
		
		thar.startCar();
		thar.stopCar();
		thar.refuelCar("diesel");
	}
}
