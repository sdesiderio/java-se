package com.sistemi.informativi.main;

import java.util.ArrayList;

import com.sistemi.informativi.enumeration.Week;

public class MainApplication {

	public static void main(String[] args) {
		
		
		ArrayList<Week> weekend = new ArrayList<>();
		weekend.add(Week.LUNEDI);
		weekend.add(Week.MARTEDI);
		
		weekend.forEach(day->System.out.println(day));

	}

}
