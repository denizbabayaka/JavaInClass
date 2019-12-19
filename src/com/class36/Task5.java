package com.class36;
import java.util.*;
public class Task5 {
	/*
     * Create the collection that will store single unique Objects of a 
     * String type in which order is preserved.
     * Write a logic to concatenate all string from the collection.
     * 
     * Create a collection of integers in which you can keep duplicates. 
     * Write a logic to find sum of all integers
     */

	public static void main(String[] args) {
		
		Set<String>wordSet=new LinkedHashSet<String>();// no duplicate do not preserve order
		String[]word= {"anne","baba","kardes","dayi","teyze","anne","hala","dayi"};
		
		for(int i=0;i<word.length;i++) {// loop word.length boyunda donuyor ve iceride worset'e  word arrayini ekliyor
			wordSet.add(word[i]);
		}
		
		Iterator<String>wordIterator=wordSet.iterator();
		String s="";
		while(wordIterator.hasNext()) {
			s=s.concat(wordIterator.next()+", ");
		}
		System.out.println(s);
		
		System.out.println("_______Task 6_________");
		List<Integer>numberList=new LinkedList<Integer>();
		
		int [] num= {1,32,5,1,5,7,8,56,87,56};
		for(int i=0;i<num.length;i++) {
			numberList.add(num[i]);
		}
		int sum=0;
		for(Integer i:numberList) {
			sum=sum+i;
		}
	System.out.println("sum of the element is "+sum);

	}

}
