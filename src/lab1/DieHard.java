package lab1;

import java.util.Scanner;

/**
 * Solution by Gamaliel Petralba.
 */
public class DieHard {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of cases: ");
		int cases = sc.nextInt();

		int jug1, jug2, condition;
		int maxJugVol, minJugVol;
		int maxJug, minJug;

		for (int i = 0; i < cases; i++) {
			//System.out.print("Enter volume of first jug: ");
			jug1 = sc.nextInt();
			//System.out.print("Enter volume of second jug: ");
			jug2 = sc.nextInt();
			//System.out.print("Enter the condition: ");
			condition = sc.nextInt();

			maxJugVol = max(jug1, jug2);
			minJugVol = min(jug1, jug2);

			maxJug = maxJugVol;
			minJug = 0;
			//System.out.println(minJugVol);

			while (true) {
				// is it impossible?
				if (maxJug == maxJugVol && minJug == minJugVol) {
					System.out.println("NO");
					break;
				}

				// is it possible?
				if (maxJug == condition || minJug == condition) {
					System.out.println("YES");
					break;
				}

				// empty or refill
				if (maxJug != 0) {
					minJug = 0;
				} else {
					maxJug = maxJugVol;
				}
				//System.out.println(maxJug + " " + minJug);

				// transfer
				if (maxJug >= (minJugVol - minJug)) {
					maxJug = maxJug - (minJugVol - minJug);
					minJug = minJugVol;
				} else {
					minJug = minJug + maxJug;
					maxJug = 0;
				}
				//System.out.println(maxJug + " " + minJug);
			}
		}
	}

	static int max(int x, int y) {
		if (x >= y) {
			return x;
		} else {
			return y;
		}
	}

	static int min(int x, int y) {
		if (x <= y) {
			return x;
		} else {
			return y;
		}
	}
}