package no4;

 class Q4_07 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (byte j = 1; j < 3; j++) {
				if (i == j)		continue;
				System.out.print(" i=" + i + " j=" + j);
			}
		}
	}
}
