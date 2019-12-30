package com.lgs.lab.interface2;

public class Application {

	public static void main(String[] args) {

		MyCalculator calc = new MyCalculator(10, 6);

		calc.plus();
		calc.minus();
		calc.multiply();
		calc.devide();

		System.out.println();

		calc.setA(15);
		calc.setB(8);

		calc.plus();
		calc.minus();
		calc.multiply();
		calc.devide();

	}

}
