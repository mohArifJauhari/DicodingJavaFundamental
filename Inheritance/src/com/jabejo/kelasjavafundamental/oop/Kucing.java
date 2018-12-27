package com.jabejo.kelasjavafundamental.oop;

public class Kucing extends Hewan {
	//
	// public Kucing() {
	// // super();
	// System.out.println("construct Kucing");
	//
	// }

	// overriding
	@Override
	public void makan() {
		System.out.println("Kucing sedang makan");
	}

	// overloading
	public void makan(String food) {
		System.out.println("Kucing makan " + food);
	}
}
/*
 * public class Kucing { private String ras; private String habitat;
 * 
 * public Kucing(String ras, String habitat) { this.ras = ras; this.habitat =
 * habitat; }
 * 
 * @Override public String toString() { return "Kucing ras: " + ras +
 * ", Habitat: " + habitat; }
 * 
 * @Override public boolean equals(Object obj) { if (obj instanceof Kucing) {
 * Kucing other = (Kucing) obj; return this.ras.equals(other.ras); } else {
 * return false; }
 * 
 * } }
 */