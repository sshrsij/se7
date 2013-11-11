package no3;

public class Q3_03 {

	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		int k = 15;
		if ((i++ < j) | (k-- > j)) {
			System.out.println(
					" value of i : "+ i+
					" value of k : "+k);
		}
	}
}
