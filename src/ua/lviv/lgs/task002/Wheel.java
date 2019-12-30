package ua.lviv.lgs.task002;

public class Wheel {

	private int diametr;
	private String name;
	private String typeTyre;

	public Wheel(int diametr, String name, String typeTyre) {
		this.diametr = diametr;
		this.name = name;
		this.typeTyre = typeTyre;
	}

	private int getDiametr() {
		return diametr;
	}

	private void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	@Override
	public String toString() {
		return "Wheel [diametr= R" + diametr + ", name=" + name + ", typeTyre=" + typeTyre + "]";
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getTypeTyre() {
		return typeTyre;
	}

	private void setTypeTyre(String typeTyre) {
		this.typeTyre = typeTyre;
	}

	public int increaseDiametr() {
		return diametr = diametr + 2;
	}

}
