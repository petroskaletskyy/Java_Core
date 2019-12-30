package ua.lviv.lgs.task002;

public class SteeringWheel {

	private int amountSteeringWheel;
	private String color;
	private String material;

	public SteeringWheel(int amountSteeringWheel, String color, String material) {
		this.amountSteeringWheel = amountSteeringWheel;
		this.color = color;
		this.material = material;
	}

	private int getAmountSteeringWheel() {
		return amountSteeringWheel;
	}

	private void setAmountSteeringWheel(int amountSteeringWheel) {
		this.amountSteeringWheel = amountSteeringWheel;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	private String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [amount=" + amountSteeringWheel + ", color=" + color + ", material=" + material + "]";
	}

	public int increaseSteeringWheel() {
		return amountSteeringWheel = amountSteeringWheel * 7;
	}

}
