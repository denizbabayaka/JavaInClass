package com.class35;

import java.util.*;

public class Country {

	public static void main(String[] args) {
		
		
		
		Map<String, String> countryMap=new TreeMap<>();
		countryMap.put("Turkey",  "Ankara");
		countryMap.put("USA",  "Washington DC");
		countryMap.put("Germany",  "Berlin");
		countryMap.put("France",  "Paris");
		countryMap.put("Afghanistan",  "Kabul");
		countryMap.put("Russia",  "Moscow");
		Collection<String> capitals=countryMap.values();
		for(String capital:capitals) {
			System.out.println(capital);
		}
		Collection<String> keys=countryMap.keySet();
		for (String country:keys) {
			System.out.println(country);
		}
		Iterator<String> keyIterator=keys.iterator();
		while(keyIterator.hasNext()) {
			String country=keyIterator.next();
			String capital=countryMap.get(country);
			System.out.println(country+" : "+capital);
		}
	}

		

	}


