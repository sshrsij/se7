package no3;

public class Q3_09 {

	public static void main(String[] args) {
		char[] o1 = { 'x', 'y', 'z' };
		char[] o2 = { 'z', 'z', 'z' };
		char[] o3 = o1;
		if(o1==o2) System.out.print("A ");
		if(o1==o3) System.out.print("B ");		
		if(o1[2]==o2[2]) System.out.print("C ");
		if(o2[2]==o3[2]) System.out.print("D ");		
	}

}
