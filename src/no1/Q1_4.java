package no1;

public class Q1_4 {

	public static void main(String[] args) {
		int val1 = 10;
		final double val2 = val1;
		System.out.println(val1 * val2 + " ");
		val1 = 10;
		//val2 = 1.2;  /*wrong line*/
		System.out.println(val1 * val2);
	}

}
