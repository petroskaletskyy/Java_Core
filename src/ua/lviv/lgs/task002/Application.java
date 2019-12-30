package ua.lviv.lgs.task002;

import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			flipCoin();
		}

	}

	public static void flipCoin() {
		int result = (int) (int) (Math.random() * 2);
		sideCoin(result, n -> n == 1);
	}

	public static void sideCoin(int result, Predicate<Integer> predicate) {
		if (predicate.test(result)) {
			System.out.println("Решка");
		} else {
			System.out.println("Орел");
		}
	}

}
