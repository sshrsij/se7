package no4;

public class Q4_09 {
	public static void main(String[] args) {
		OuterLoop: for (int i = 0; i < 2; i++) {
			for (int j = 1; j < 4; j++) {
				if (i == j) {
					continue OuterLoop;
				}
				System.out.println(" i = " + i + " j = " + j);
			}
		}
	}
}
