package com.class37;

import java.util.*;

public class Repl211 {

	public static void main(String[] args) {

		// declare a List in which we store collection of Maps
		List<Map<String, Object>> dataList = new ArrayList<>();

		// create a map that will store String as key and object(different types of data
		// we can store) as value
		Map<String, Object> appleMap = new TreeMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10.0);
		dataList.add(appleMap);

		HashMap<String, Object> orangeMap = new HashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		dataList.add(orangeMap);
		double subPrice = 0;
		double purchase = 0;
		double price;
		double quantity;
		for (Map<String, Object> s : dataList) {
			String items = s.get("Items").toString();
			price = (double) s.get("Price");
			quantity = (int) s.get("Quantity");
			subPrice = price * quantity;
			System.out.println(
					"Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + subPrice);
			purchase = purchase + subPrice;
		}
		System.out.println("Your Purchase total :" + purchase);
	}
}
