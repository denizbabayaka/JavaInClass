package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {

		double d = 12;
		System.out.println(d);

		byte b = 127; // widening or automatic or implicit casting (changing one type to another ) bu
						// metodla degerleri arttirip cogaltiyoruz
		int i = b;
		int num = 123;
		double num1 = num;

		double d2 = 123.56; // narrowing or explicit or manual casting (bu metodla degerleri daraltiyoruz )
		int d3 = (int) d2;
		System.out.println(d3);

		int d4 = 1000;
		byte d5 = (byte) d4;
		System.out.println(d5);

	}

}
