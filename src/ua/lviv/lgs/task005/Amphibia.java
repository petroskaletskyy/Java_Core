package ua.lviv.lgs.task005;

public class Amphibia {

	private int height;
	private double weight;

	public Amphibia(int height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Amphibia [height=" + height + ", weight=" + weight + "]";
	}

	final public void eat() {
		System.out.println("я њм мух");
	}

	final public void sleep() {
		System.out.println("я багато сплю");
	}

	final public void swim() {
		System.out.println("я плаваю краще вс≥х");
	}

	final public void walk() {
		System.out.println("я мало гул€ю");
	}

}
