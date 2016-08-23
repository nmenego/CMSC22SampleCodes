package lab1;

import java.util.Scanner;

/**
 * Solution by Mark Cobo.
 */
public class Anagram {

	public static void check(int length, String input) {
		char[] in = input.toCharArray();
		int i = 0;
		while (i < (length / 2)) {
			int j = length / 2;
			while (j < length) {
				if (in[i] == in[j]) {
					in[j] = '0';
					break;
				}
				j++;
			}
			i++;
		}
		int ctr = 0;
		for (i = length / 2; i < length; i++) {
			if (in[i] != '0')
				ctr++;
		}
		System.out.println(ctr);
	}

	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		while (cases != 0) {
			String input = scan.next();
			if (input.length() % 2 == 0) {
				check(input.length(), input);
			} else
				System.out.println("-1");
			cases--;
		}
	}
}