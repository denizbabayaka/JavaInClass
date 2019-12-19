package com.class36;
import java.util.*;
import java.util.Map.Entry;
//create a car class that will have variables ,methods and costructor
// create a map that will hold car number and car objects store in it

class Car{
	String make,model;
	
	public Car(String make,String model) {
		this.make=make;
		this.model=model;
	}
	public void display() {
		System.out.println(make+" "+model);
	}
	
	
	
}


public class CarTest {

	public static void main(String[] args) {
		
		Map<Integer,Car> mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S500"));
		mapCar.put(4, new Car("Toyata", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(6, new Car("Lincoln", "Mkc"));
		
		//display only value objects
		Collection<Car> coll=mapCar.values();
		for(Car c:coll) {
			System.out.println(c.make+"-- "+c.model);
			c.display();
		}
		
		
		System.out.println(mapCar.size());
		
		// map key to its corresponding values(entrySet or keySet)
		
		Set<Entry<Integer,Car>>set=mapCar.entrySet();
		for(Entry<Integer,Car>ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key "+i +" is associated with value of "+c.make);
			
		}
		// using keyset to map keys to values
		Set<Integer>keySet= mapCar.keySet();
		for(int key:keySet) {
			//System.out.println(key+" "+mapCar.get(key).make+"---"+ mapCar.get(key).model);
			Car car=mapCar.get(key);
			String carDetails=car.make+"-"+car.model;
			System.out.println(carDetails);
		}
		// use Iterator to iterate through values,keyset ,entrySet
		
		Iterator<Entry<Integer,Car>>ent1=mapCar.entrySet().iterator();
		Entry<Integer,Car>s1=ent1.next();
		while(ent1.hasNext()) {
			Entry<Integer,Car>entry=ent1.next();
			Integer i=entry.getKey();
			Car car=entry.getValue();
			System.out.println(i+":");
			car.display();
		}
		
		
	

	
	}
}
