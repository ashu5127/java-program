//Write a Java program to search an element in a array list.  
package code;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numbers =new ArrayList <Integer>();
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		System.out.println(numbers);
		// Search the value 11
		System.out.println("find the 11 elemnts:");
		if(numbers.contains(11)) {
		System.out.println("numbers is found");
		}else {
			System.out.println("numbers is not found");
		}
	}

}
