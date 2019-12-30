package ua.lviv.lgs;

public class Application {
	
	public static void main(String[] arg) {
		
		//1.Написати по одній змінній кожного типу примітивних типів даних
		
		byte b = 115;
		short s = -1123;
		int i = -64536;
		long l = 2147483648L; 
		
		char a = 'a';
		
		
		float pi = 3.14f;
		double d = -4.12;
		
		boolean flag = true;
		
		System.out.println("Integer i = " + i);
		System.out.println("Byte b = " + b);
		System.out.println("Short s = " + s);
		System.out.println("Long l = " + l);
		System.out.println("Char a = " + a);
		System.out.println("Float pi = " + pi);
		System.out.println("Double d = " + d);
		System.out.println("Boolean flag = " + flag);
		
		System.out.println("------------------------------------------");
		
		//2.Вивести на консоль мінімальне та максимальне значення типів даних. Вивід здійснюється за допомогою 
		//System.out.println(); та Java Wrapper (обгортки примітивів)
		
		System.out.println("Min Byte = " + Byte.MIN_VALUE);
		System.out.println("Max Byte = " + Byte.MAX_VALUE);
		
		System.out.println("Min Short = " + Short.MIN_VALUE);
		System.out.println("Max Short = " + Short.MAX_VALUE);
		
		System.out.println("Min Integer = " + Integer.MIN_VALUE);
		System.out.println("Max Integer = " + Integer.MAX_VALUE);
		
		System.out.println("Min Long = " + Long.MIN_VALUE);
		System.out.println("Max Long = " + Long.MAX_VALUE);
		
		System.out.println("Min Float = " + Float.MIN_VALUE);
		System.out.println("Max Float = " + Float.MAX_VALUE);
		
		System.out.println("Min Double = " + Double.MIN_VALUE);
		System.out.println("Max Double = " + Double.MAX_VALUE);
		
		System.out.println("Min Char = " + Character.MIN_VALUE);
		System.out.println("Max Char = " + Character.MAX_VALUE);
		
		System.out.println("------------------------------------------");
		
		//3. Створити масив, наповнити його 10 значеннями типу int, знайти максимальне та мінімальне значення в масиві 
		//та вивести їх на консоль.
		
		int [] mas = { 2, 5, -3, -21, 12, 45, -10, 9, 47, -100 };
		
		int min = 0, max = 0; 
		
		for (int n = 0; n < mas.length; n++) {
			if (mas[n] > max) max = mas[n];
			if (mas[n] < min) min = mas[n];
		}
		
		System.out.println("Min value = " + min);
		System.out.println("Max value = " + max);
		
	}

}
