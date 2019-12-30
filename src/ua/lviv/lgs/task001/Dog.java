package ua.lviv.lgs.task001;

public class Dog extends Pet {

	private String name;
	private String color;

	public Dog(int height, double weight, String name, String color) {
		super(height, weight);
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", toString()=" + super.toString() + "]";
	}

	@Override
	void voice() {
		System.out.println("ί οερ-Γΰσσσ-Γΰσσσ");

	}

}
