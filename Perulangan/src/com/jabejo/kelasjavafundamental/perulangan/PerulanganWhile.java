package com.jabejo.kelasjavafundamental.perulangan;

public class PerulanganWhile {

	public static void perulanganWhile() {
		int nilai = 1;
		while (nilai <= 10) {
			System.out.println("Angka : " + nilai);
			nilai++;
		}
	}

	public static void perulanganDoWhile() {
		int nilai = 1;
		do {
			System.out.println("Angka : " + nilai);
			nilai++;
		} while (nilai <= 10);
	}
}
