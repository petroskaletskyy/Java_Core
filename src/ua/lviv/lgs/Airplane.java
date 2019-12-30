package ua.lviv.lgs;

public abstract class Airplane extends AirplaneManagment {

	double width;
	double height;
	double weight;

	public Airplane(double width, double height, double weight) {
		super();
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	void EngineStart() {
		int t = 20 + (int) (Math.random() * ((88 - 20) + 1));
		System.out.println("Time to take-off - " + t + " sec.");
	}

	void TakeOffAirplane() {
		double t = Math.random() * (1000 + 1);
		System.out.printf("Total trip is %.2f km \n", t);
	}

	void LandindAirplane() {
		System.out.println("Airplane start landing");
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
