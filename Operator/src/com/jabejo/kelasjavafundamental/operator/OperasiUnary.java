package com.jabejo.kelasjavafundamental.operator;

public class OperasiUnary {

	public static void main() {
		System.out.println("Operator Unary Plus");
		int nilaiAwal = 5;
		int hasil = +nilaiAwal;
		System.out.println("Hasil +5 = " + hasil);
		System.out.println();

		System.out.println("Operator Unary Minus");
		int nilaiAwal2 = 5;
		nilaiAwal2 = -nilaiAwal2;
		System.out.println("Hasil -5 = " + nilaiAwal2);
		System.out.println();

		System.out.println("Operator Unary peningkatan nilai sebesar 1 point");
		int nilaiAwal3 = 5;
		nilaiAwal3++;
		System.out.println("Hasil 5++ = " + nilaiAwal3);
		System.out.println();

		System.out.println("Operator Unary pengurangan nilai sebesar 1 point");
		int nilaiAwal4 = 5;
		nilaiAwal4--;
		System.out.println("Hasil 5-- = " + nilaiAwal4);
		System.out.println();

		System.out.println("Operator Unary komplemen logika");
		boolean sukses = false;
		System.out.println("Hasil !false = " + !sukses);
		System.out.println();
	}

}
