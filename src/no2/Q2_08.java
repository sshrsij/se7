package no2;

import java.util.*;

 class Q2_08 {
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		//--------------------------------
		List<Integer> list = new ArrayList<Integer>();	/*C*/
//		ArrayList list = new ArrayList();		/*F*/
		//--------------------------------
		list.add(i1);		list.add(i2);
		System.out.println(list);
	}
}
