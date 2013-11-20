package no4;

 class Q4_10 {

	public static void main(String[] args) {
		int i = 2;
		Outer: if (i < 5) {
			System.out.println("i:" + i);
			i++;
			continue Outer;
		}
	}
}
