package ua.lviv.lgs.task005;

public class Application {

	public static void main(String[] args) {

		Printable eat = () -> System.out.println("я њм мух");
		Printable sleep = () -> System.out.println("я багато сплю");
		Printable swim = () -> System.out.println("я плаваю краще вс≥х");
		Printable walk = () -> System.out.println("я мало гул€ю");

		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}
}
