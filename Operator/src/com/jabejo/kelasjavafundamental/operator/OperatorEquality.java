package com.jabejo.kelasjavafundamental.operator;

public class OperatorEquality {

	public static void main() {
		int value1 = 5;
		int value2 = 5;
		boolean hasil;

		System.out.println("Sama Dengan...");
		hasil = value1 == value2;
		System.out.println("Hasil 'value1 == value2' adalah " + hasil);
		System.out.println();

		System.out.println("Tidak Sama Dengan...");
		hasil = value1 != value2;
		System.out.println("Hasil 'value1 != value2' adalah " + hasil);
		System.out.println();
		
		System.out.println("Lebih Besar Dari...");
		hasil = value1 > value2;
		System.out.println("Hasil 'value1 > value2' adalah " + hasil);
		System.out.println();
		
		System.out.println("Sama atau Lebih Besar Dari...");
		hasil = value1 >= value2;
		System.out.println("Hasil 'value1 >= value2' adalah " + hasil);
		System.out.println();
		
		System.out.println("Kurang Dari...");
		hasil = value1 < value2;
		System.out.println("Hasil 'value1 < value2' adalah " + hasil);
		System.out.println();
		
		System.out.println("Sama atau Kurang Dari...");
		hasil = value1 <= value2;
		System.out.println("Hasil 'value1 <= value2' adalah " + hasil);
		System.out.println();
	}

}
