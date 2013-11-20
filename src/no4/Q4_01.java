package no4;

 class Q4_01 {

	public static void main(String[] args) {
		int[5] ary = { 1, 2, 3, 4, 5 };// compileError
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
	}
}
