package ua.lviv.lgs.task005;

public class Application {

	public static void main(String[] args) {

		Amphibia frog = new Frog(8, 1, 3, "Green");
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();

	}
}
