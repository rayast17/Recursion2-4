package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	private static int moves = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		// Find the solution recursively

		moveDisks(n, 'A', 'B', 'C');
		System.out.println("The moves are " + moves);
	}

	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {

		if (n == 1) { // Stopping condition
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moves++;

		} else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moves++;
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}
