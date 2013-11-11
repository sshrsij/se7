package no3;

public class Q3_07 {

	public static void main(String[] args) {
		boolean i = true;
		boolean j = false;
		short k = 10;
		if ((k == 10) && (j = true))	k--;
		if ((i = false) || (k == 9))
		k--;
		k--;
		System.out.println("k= "+k);
	}

}
