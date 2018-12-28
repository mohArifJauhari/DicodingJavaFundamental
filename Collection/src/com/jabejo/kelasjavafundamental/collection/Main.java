package com.jabejo.kelasjavafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] heroes = new String[2];
		heroes[0] = "riki";
		heroes[1] = "sven";

		List planets = new ArrayList();
		planets.add("merkurius");
		planets.add("venus");
		planets.add("bumi");
		planets.add("mars");

		System.out.println("List planet awal :");
		for (int i = 0; i < planets.size(); i++) {
			System.out.println("\t index - " + i + " = " + planets.get(i));
		}

		planets.remove("bumi");

		System.out.println("List planet akhir :");
		for (int i = 0; i < planets.size(); i++) {
			System.out.println("\t index - " + i + " = " + planets.get(i));
		}
	}

}
