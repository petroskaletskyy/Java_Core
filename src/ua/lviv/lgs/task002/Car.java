package ua.lviv.lgs.task002;

public class Car {

	private double price;
	private int odometr;
	private Wheel wheel;
	private SteeringWheel steeringWheel;
	private Body body;

	public Car(double price, int odometr, Wheel wheel, SteeringWheel steeringWheel, Body body) {
		super();
		this.price = price;
		this.odometr = odometr;
		this.wheel = wheel;
		this.steeringWheel = steeringWheel;
		this.body = body;
	}

	private double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	private int getOdometr() {
		return odometr;
	}

	private void setOdometr(int odometr) {
		this.odometr = odometr;
	}

	private Wheel getWheel() {
		return wheel;
	}

	private void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	private SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	private void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	private Body getBody() {
		return body;
	}

	private void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", odometr=" + odometr + ", wheel=" + wheel + ", steeringWheel=" + steeringWheel
				+ ", body=" + body + "]";
	}

}
