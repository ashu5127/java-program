// Write a Java program to sort a given array list.  

package code;

import java.util.ArrayList;
import java.util.Collections;

public class SoretArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numbers =new ArrayList <Integer>();
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		System.out.println(numbers);
		Collections.sort(numbers); 
		for (int i : numbers) {
		      System.out.println(i);
		    }

	}

}
