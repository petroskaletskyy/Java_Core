package ua.lviv.lgs.task004;

public class Overloading {
	
	int a;
	int b;
	int c;
	
	public Overloading(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Overloading(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}
	
}
