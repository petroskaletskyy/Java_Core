package ua.lviv.lgs.task005;

public class Frog extends Amphibia {

	private int age;
	private String name;

	public Frog(int height, double weight, int age, String name) {
		super(height, weight);
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Frog [age=" + age + ", name=" + name + ", toString()=" + super.toString() + "]";
	}

}
