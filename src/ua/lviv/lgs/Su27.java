package ua.lviv.lgs;

public class Su27 extends Airplane implements SpecialFacilitiesable {

	int maxSpeed;
	String color;

	public Su27(double width, double height, double weight, int maxSpeed, String color) {
		super(width, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void TurboAcceleration() {
		int t = 10 + (int) (Math.random() * ((100 - 10) + 1));
		System.out.println("Max speed is " + (maxSpeed + t) + " km");
	}

	@Override
	public void StelthTechnology() {
		int t = 1 + (int) (Math.random() * ((60 - 1) + 1));
		System.out.println("Airplane is not visible " + t + " seconds");
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void NuclearStrike() {
		int t = 1 + (int) (Math.random() * ((10 - 1) + 1));
		System.out.println("Airplane strike " + t + " rocket");
	}

	@Override
	public String toString() {
		return "Airplane Su27: maxSpeed= " + maxSpeed + ", color= " + color + ", width= " + width + ", height= " + height
				+ ", weight= " + weight + "]";
	}
	
	

}
