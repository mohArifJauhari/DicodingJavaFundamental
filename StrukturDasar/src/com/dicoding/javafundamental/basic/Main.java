package com.dicoding.javafundamental.basic;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;

public class Main {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Hari ini = " + today);
		Date tomorrow = DateUtils.addDays(today, 1);
		System.out.println("Besok = " + tomorrow);
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Gitar.bunyi();
		Mobil.jumlahBan();
		Motor.jumlahBan();
		Kereta.jumlahBan();
	}

}
