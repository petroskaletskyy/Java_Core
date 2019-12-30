package ua.lviv.lgs.task002;

public class Body {

	private int amountYear;
	private String color;
	private int weight;

	public Body(int amountYear, String color, int weight) {
		this.amountYear = amountYear;
		this.color = color;
		this.weight = weight;
	}

	private int getAmountYear() {
		return amountYear;
	}

	private void setAmountYear(int amountYear) {
		this.amountYear = amountYear;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	private int getWeight() {
		return weight;
	}

	private void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int increaseBody() {
		return weight = weight - 10;
	}

	@Override
	public String toString() {
		return "Body [amountYear=" + amountYear + ", color=" + color + ", weight=" + weight + "]";
	} 
	
	

}
