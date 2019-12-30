package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	int a;
	int b;

	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "MyCalculator [a=" + a + ", b=" + b + "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public void plus() {
		int res = a + b;
		System.out.println("Result of operation: " + a + " PLUS " + b + " = " + res);
	}

	@Override
	public void minus() {
		int res = a - b;
		System.out.println("Result of operation: " + a + " MINUS " + b + " = " + res);
	}

	@Override
	public void multiply() {
		int res = a * b;
		System.out.println("Result of operation: " + a + " MULTIPLY " + b + " = " + res);
	}

	@Override
	public void devide() {
		double res = (double) a / (double) b;
		System.out.println("Result of operation: " + a + " DEVIDE " + b + " = " + res);
	}

}
