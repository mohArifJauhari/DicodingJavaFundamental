package com.jabejo.kelasjavafundamental.array;

public class Main {

	public static void main(String[] args) {
		// cobaArray();

//		loopingArray();
		array2D();
	}

	private static void cobaArray() {
		// Deklarasi Array
		// cara pertama
		double[] arrA;
		arrA = new double[10];

		// cara kedua
		double arrB[] = new double[10];

		// Inisiasi Array
		// cara pertama
		int[] arrInt = new int[] { 1, 2, 3, 4, 5, 6 };

		// cara kedua
		int[] arrInt2 = new int[6];
		arrInt2[0] = 1;
		arrInt2[1] = 2;
		arrInt2[2] = 3;
		arrInt2[3] = 4;
		arrInt2[4] = 5;
		arrInt2[5] = 6;

		for (int i = 0; i < arrInt2.length; i++) {
			System.out.println("arrInt2[" + i + "] : " + arrInt2[i]);
		}

		// cara ketiga
		System.out.println("----mencetak arrInt3----");
		int[] arrInt3 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("arrInt3.length : " + arrInt3.length);
		for (int i = 0; i < arrInt3.length; i++) {
			System.out.println("arrInt3[" + i + "] : " + arrInt3[i]);
		}

	}

	public static void loopingArray() {
		int[] arrInt = new int[100];
		// inisialisasi arrInt dari elemen 1 sampai 100
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i + 1;
		}

		// Tampilkan arrInt dari elemen ke 1 sampai 100
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("arrInt[" + i + "] : " + arrInt[i]);
		}

	}

	public static void array2D() {
		char[][] arrChar = new char[2][];
		arrChar[0] = new char[2];
		arrChar[1] = new char[3];

		// Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
		arrChar[0][0] = 'A';
		arrChar[0][1] = 'B';

		// Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
		arrChar[1][0] = 'C';
		arrChar[1][1] = 'D';
		arrChar[1][2] = 'E';

		// Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
		System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
		System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
		// Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
		System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
		System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
		System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);
	}

}
