package no2;

public class Q2_01 {

	public static void main(String[] args) {
		String[] array = new String[3];
		array[1] = "10";
		array[2] = "20";
		array[3] = "30";// raise java.lang.ArrayIndexOutOfBoundsException
		System.out.println(array[1] + array[2] + array[3]);

	}
}
