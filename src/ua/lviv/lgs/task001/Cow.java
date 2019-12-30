package ua.lviv.lgs.task001;

public class Cow extends Pet {

	private String name;
	private int milkYild;

	public Cow(int height, double weight, String name, int milkYild) {
		super(height, weight);
		this.name = name;
		this.milkYild = milkYild;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMilkYild() {
		return milkYild;
	}

	public void setMilkYild(int milkYild) {
		this.milkYild = milkYild;
	}

	@Override
	public String toString() {
		return "Cow [name=" + name + ", milkYild=" + milkYild + ", toString()=" + super.toString() + "]";
	}

	@Override
	void voice() {
		System.out.println("ß êîğîâà- Ìóóó-Ìóóó");

	}

}
