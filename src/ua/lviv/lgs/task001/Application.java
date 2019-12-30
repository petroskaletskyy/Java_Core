package ua.lviv.lgs.task001;

public class Application {

	public static void main(String[] args) {
		
		Cat cat = new Cat(18, 6, "Lia", 5);
		System.out.println(cat);
		cat.voice();
		
		System.out.println();
		
		Dog dog = new Dog(38, 12, "Jack", "black");
		System.out.println(dog);
		dog.voice();
		
		System.out.println();
		
		Cow cow = new Cow(120, 540, "Bana", 6);
		System.out.println(cow);
		cow.voice();
		
		
	}
	

}
