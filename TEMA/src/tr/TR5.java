package tr;

import java.util.Scanner;

public class TR5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		double curs = scanner.nextDouble();
		System.out.println("Suma in EUR: " + (long) (sum / curs));
		System.out.println("Suma in RON: " + (long) (sum % curs));
		scanner.close();
	}
}
