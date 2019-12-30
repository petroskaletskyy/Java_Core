package ua.lviv.lgs.task003;

import java.text.Format;
import java.util.Formatter;

public class Application {

	public static void main(String[] args) {

		Formatter frm1 = new Formatter();
		System.out.print("Min Duuble - ");
		System.out.println(frm1.format("%3.2e", Double.MIN_VALUE));
		Formatter frm2 = new Formatter();
		System.out.print("Max Double - ");
		System.out.println(frm2.format("%3.2e", Double.MAX_VALUE));
		System.out.println();

		Formatter frm3 = new Formatter();
		System.out.print("Min Float - ");
		System.out.println(frm3.format("%3.2e", Float.MIN_VALUE));
		Formatter frm4 = new Formatter();
		System.out.print("Max Float - ");
		System.out.println(frm4.format("%3.2e", Float.MAX_VALUE));

		frm1.close();
		frm2.close();
		frm3.close();
		frm4.close();
	}

}
