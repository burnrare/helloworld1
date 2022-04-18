package co.edu.abstracts;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 1. 시동 켜기 2. 출발하기 3. 운행 4. 멈추기 5. 시동 끄기
//		Sonate car = new Sonate();
		Car car = null;
		car = new Sonate();
		car = new Avante();
//		Avante car = new Avante();
		while (true) {
			System.out.println("1. 시동 켜기 | 2. 출발하기 | 3. 운행 | 4. 멈추기 | 5. 시동 끄기");
			int menu = scn.nextInt();

			if (menu == 1) {
				car.turnOn();
			} else if (menu == 2) {
				car.strat();
			} else if (menu == 3) {
				car.run();
			} else if (menu == 4) {
				car.stop();
			} else if (menu == 5) {
				car.turnOff();
			} else {
				break;
			}
		}
	}
}
