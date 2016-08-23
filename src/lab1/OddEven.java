package lab1;

import java.util.Scanner;

/**
 * Solution by Chezkah Tahadlangit.
 */
public class OddEven {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

		System.out.print("BYE!");
	}

}
