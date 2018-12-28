package com.jabejo.kelasjavafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	// public static void main(String[] args) {
	// String[] heroes = new String[2];
	// heroes[0] = "riki";
	// heroes[1] = "sven";
	//
	// List planets = new ArrayList();
	// // List<String> planets = new ArrayList<String>();
	// planets.add("merkurius");
	// planets.add("venus");
	// planets.add("bumi");
	// planets.add("mars");
	//
	// System.out.println("List planet awal :");
	// for (int i = 0; i < planets.size(); i++) {
	// System.out.println("\t index - " + i + " = " + planets.get(i));
	// }
	//
	// planets.remove("bumi");
	//
	// System.out.println("List planet akhir :");
	// for (int i = 0; i < planets.size(); i++) {
	// System.out.println("\t index - " + i + " = " + planets.get(i));
	// }
	//
	// Set<String> planets2 = new HashSet<>();
	// planets2.add("bumi");
	// planets2.add("bumi");
	// planets2.add("bumi");
	// planets2.add("mars");
	// planets2.add("mars");
	// planets2.add("jupiter");
	//
	// System.out.println("set planet awal: (size = " + planets2.size() + ")");
	// for (String planet : planets2) {
	// System.out.println("\t" + planet);
	// }
	//
	// planets2.remove("mars");
	//
	// System.out.println("set planet akhir: (size = " + planets2.size() + ")");
	// for (Iterator iterator = planets2.iterator(); iterator.hasNext();) {
	// System.out.println("\t" + (String) iterator.next());
	// }
	//
	// List<String> planets3 = new ArrayList<String>();
	// planets3.add("merkurius");
	// planets3.add("venus");
	// planets3.add("bumi");
	// planets3.add("mars");
	//
	// System.out.println("planet 3");
	//
	// for (String planet : planets3) {
	// System.out.println("\t" + planet);
	// }
	//
	// System.out.println("Menggunakan Map --> HashMap");
	// Map<String, PlanetLagi> planets4 = new HashMap<>();
	// planets4.put("key-1", new PlanetLagi("merkurius", 0.23));
	// planets4.put("key-2", new PlanetLagi("venus", 0.24));
	// planets4.put("key-3", new PlanetLagi("bumi", 0.25));
	// planets4.put("key-4", new PlanetLagi("mars", 0.26));
	// planets4.put("key-4", new PlanetLagi("mars-X", 0.26));
	//
	// System.out.println("Map planet awal: (size = " + planets4.size() + ")");
	// for (String key : planets4.keySet()) {
	// System.out.println("\t " + key + " : " + planets4.get(key));
	// }
	//
	// planets4.remove("key-3");
	//
	// System.out.println("Map planet akhir: (size = " + planets4.size() + ")");
	// for (PlanetLagi pl : planets4.values()) {
	// System.out.println(pl);
	// }
	//
	// }

	public static void main(String[] args) {
		List<String> lo = new ArrayList();
		lo.add("lo - string1");
		lo.add("lo - string2");

		print(lo);

		List<PlanetLagi> lp = new ArrayList();
		lp.add(new PlanetLagi("mars", 0.3));
		lp.add(new PlanetLagi("merkurius", 0.2));

		print(lp);

		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList();

		// T inferred to be Object
		arrayToCollection(oa, co);

		String[] sa = new String[100];
		Collection<String> cs = new ArrayList();

		// T inferred to be String
		arrayToCollection(sa, cs);

		// T inferred to be Object
		arrayToCollection(sa, co);

		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList();

		// T inferred to be Number
		arrayToCollection(ia, cn);

		// T inferred to be Number
		arrayToCollection(fa, cn);

		// T inferred to be Number
		arrayToCollection(na, cn);

		// T inferred to be Object
		arrayToCollection(na, co);

		// compile-error
		// arrayToCollection(na, cs);

		String[] sa2 = { "Happy", "Coding" };

		Collection r = arrayToCollection2(sa2);

		print(r);

	}

	private static void print(Collection<?> coll) {
		for (Object o : coll) {
			System.out.println(o);
		}

	}

	static <T> void arrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o);
		}
	}

	// mengunakan wildcards
	static void print2(Collection<?> col) {
		for (Object o : col) {
			System.out.println(o);
		}
	}

	// menggunakan generic methods
	static <T> Collection arrayToCollection2(T[] a) {
		Collection<T> c = new ArrayList();
		for (T o : a) {
			c.add(o);
		}
		return c;
	}

}

class PlanetLagi {
	private String name;
	private double mass;

	public PlanetLagi(String name, double mass) {
		this.name = name;
		this.mass = mass;
	}

	@Override
	public String toString() {
		return "Planet: " + name + ", mass: " + mass;
	}

	public void print() {
		System.out.println(toString());
	}

}
