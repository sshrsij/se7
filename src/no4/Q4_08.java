package no4;

public class Q4_08 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (byte j = 1; j < 3; j++) {
				if (i == j)		break;
				System.out.print(" i=" + i + " j=" + j);
			}
		}
	}

}
