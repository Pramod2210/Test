package Dav;

import java.util.Scanner;

public class EMenu {

	public void singleMenus() {
		System.out.println("Testing\nJava\n.Net\nDatabase");

	}

	public void submenu() {
		System.out.println("1)Testing\n2)Java\n3).Net\n4)Database");
		Scanner sc = new Scanner(System.in);
		System.out.println("select Topic no");
		int i = sc.nextInt();
		switch (i) {
		case 1: {
			System.out.println("Selenium\nManual Testing\nDB Testing\nUnit Testing");
			break;
		}
		case 2: {
			System.out.println("Advance Java\nCore Java\nSpring\nHibernet");
			break;
		}
		case 3: {
			System.out.println("C#\nASP.Net\nADO.NET\nMVC");
			break;

		}
		case 4: {
			System.out.println("SQL\nMySQL\nOracle\nH2");
			break;
		}

		}

	}
}
