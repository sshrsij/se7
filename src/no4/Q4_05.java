package no4;

public class Q4_05 {
	public static void main(String[] args) {
		String[] arrays = { "xxx", "yyy", "zzz" };
		for (String s : arrays)	System.out.println(s);// F
		for (int i = 0; i < arrays.length; i++)
			System.out.println(arrays[i]); // H

	}
}
