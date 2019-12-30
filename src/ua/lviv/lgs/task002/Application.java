package ua.lviv.lgs.task002;

public class Application {

	public static void main(String[] args) {

		Wheel wheel = new Wheel(13, "Michelin", "winter");
		
		SteeringWheel steeringWheel = new SteeringWheel(5, "red", "wood");
	
		Body body = new Body(15, "yellow", 1400);
	
			
		
		Car car = new Car(25500.00, 18568, wheel, steeringWheel, body);
		System.out.println(car);
		System.out.println("------------\"\"----------------");
		
		wheel.increaseDiametr();
		System.out.println(car);
		System.out.println("------------\"\"----------------");
		
		steeringWheel.increaseSteeringWheel();
		System.out.println(car);
		System.out.println("------------\"\"----------------");
		
		body.increaseBody();
		System.out.println(car);
		System.out.println("------------\"\"----------------");
	}
}
