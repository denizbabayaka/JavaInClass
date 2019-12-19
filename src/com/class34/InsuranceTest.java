package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {
public static void main(String[] args) {
	
       List<Insurance>obj=new ArrayList<Insurance>();
       obj.add(new Car("Progressive",500, "Toyota"));
       obj.add(new Pet("Progressive", 700, "Dog"));
       obj.add(new Health("Progressive", 900));
       System.out.println("_______FOR LOOP_____");
       for(int i=0;i<obj.size();i++) {
    	   obj.get(i).getQoute();
    	   obj.get(i).cancelInsurance();
       }
       System.out.println("____FOR EACH_____");
       for(Insurance obj1:obj) {
    	   obj1.getQoute();
    	   obj1.cancelInsurance();
       }
       System.out.println("_____WhileLoop_____");
       Iterator<Insurance>obj2=obj.iterator();
       
       while(obj2.hasNext()) {
    	   Insurance obj3=obj2.next();
    	   obj3.getQoute();
    	   obj3.cancelInsurance();
       }
}
}
