package com.test.arrays;

public class ReverseArray {

	static int[] a = { 1, 2, 3, 4, 5, 6 };
	static int lenght;

	public static void main(String[] args) {
		lenght = a.length;
		// System.out.println("hi");
		getArrayElements(a);
		getReverse(a);
		System.exit(0);
	}

	private static void getReverse(int[] a2) {
		System.out.println("--------rervers-----");
		for (int i = 5; i >= 0; i--) {

			System.out.println(a[i]);

		}
	}

	private static void getArrayElements(int[] a2) {
		// System.out.println(a);
		for (int i = 0; i < lenght; i++) {
			System.out.println(a[i]);
		}

	}

}
