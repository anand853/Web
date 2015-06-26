package com.test.arrays;

public class FindDuplicates {

	static int[] a = { 2, 5, 6, 7, 4, 2 };

	public static void main(String[] args) {
		// System.out.println(a);
		for (int i = 0; i < a.length; i++) {
			// System.out.println("i value is-->" + a[i]);
			for (int j = i + 1; j < a.length; j++) {
				// System.out.println("j value is-->" + a[j]);
				if (a[j] == a[i]) {
					System.out.println("duplicate value is->" + a[i]);
				}
			}
		}

	}

}
