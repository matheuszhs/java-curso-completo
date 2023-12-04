package controllers;

public class ContinueLabel {

	public static void main(String[] args) {

		out: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					continue out;
				}

				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}

		System.out.println("End!");
	}
}
