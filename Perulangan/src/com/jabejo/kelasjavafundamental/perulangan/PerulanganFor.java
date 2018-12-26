package com.jabejo.kelasjavafundamental.perulangan;

public class PerulanganFor {

	public static void forBiasa() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Angka : " + i);
		}
	}

	public static void forBersarang() {
		int a = 5;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
