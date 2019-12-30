package ua.lviv.lgs.task001;

public abstract class Pet {
	private int height;
	private double weight;

	public Pet(int height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	abstract void voice();

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

	public String toString() {
		return "Pet [height=" + height + ", weight=" + weight + "]";
	}

}
