package ua.lviv.lgs.task002;

import java.util.Random;

public class CoinToss {

	public void flip(int count) {

		int eagle = 0;
		int tale = 0;

		for (int i = 1; i <= count; i++) {
			int m = (int) (Math.random() * 2);
			if (m == 1) {
				tale += 1;
			} else {
				eagle += 1;
			}
		}

		System.out.println("Монетку підкинуто - " + count + " раз");
		System.out.println("Орел випав -" + eagle + " раз, решка - " + tale + " раз");
	}

}
