package com.jabejo.kelasjavafundamental.oop;

public class Main {

	public static void main(String[] args) {
		// Hewan hewan = new Hewan();
		// hewan.makan();
		//
		// System.out.println("------------------------");
		//
		// Kucing kucing = new Kucing();
		// kucing.makan();
		// kucing.makan("daging ikan");

		// Kucing meow = new Kucing("Ocicat", "tropis");
		// Kucing puss = new Kucing("Ocicat", "subtropis");
		// Kucing popo = new Kucing("Anggora", "subtropis");
		//
		// System.out.println(meow.toString());
		// System.out.println(puss.toString());
		// System.out.println(popo.toString());
		//
		// System.out.println("meow equals puss ? " + meow.equals(puss));
		// System.out.println("meow equals popo ? " + meow.equals(popo));

		Object o = new Kucing();
		Hewan h = new Kucing();
		Kucing k = new Kucing();

		// o.makan(); -> error, karena method makan() tidak ada di class Object
		System.out.println("h.makan();");
		h.makan();
		System.out.println("k.makan();");
		k.makan();

		
		System.out.println("-------------------------------------------");
		Object object = k; // bisa langsung diassign
		Hewan hewan = k; // bisa langsung diassign

		// object.makan(); -> error, karena method makan() tidak ada di class Object
		hewan.makan();

		System.out.println("-------------------------------------------");
		Kucing kucing = (Kucing) h;
		kucing.makan();

//Hewan harimau = new Hewan();
//Kucing anggora = (Kucing) harimau;

	}

}
