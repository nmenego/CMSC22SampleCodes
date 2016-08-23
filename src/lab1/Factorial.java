package lab1;

import java.io.*;
import java.util.*;

/**
 * Solution by Aiden Bedio.
 */
public class Factorial {

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		int _n;
		_n = Integer.parseInt(in.nextLine().trim());

		res = factorial(_n);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}

}
