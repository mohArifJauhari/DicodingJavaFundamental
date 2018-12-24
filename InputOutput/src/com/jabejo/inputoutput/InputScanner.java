package com.jabejo.inputoutput;

import java.util.Scanner;

public class InputScanner {

	public static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program penjumalahan sangat sederhana");
		System.out.print("Masukan Angka pertama : ");
		int value1 = scanner.nextInt();
		System.out.print("Masukan Angka kedua : ");
		int value2 = scanner.nextInt();
		int hasil = value1 + value2;
		System.out.println("Hasilnya adalah : " + hasil);
	}

}
