//Write a Java program to update specific array element by given element.  

package code;

import java.util.ArrayList;

public class UpdateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numbers =new ArrayList <Integer>();
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		System.out.println(numbers);
		numbers.set(2, 55);
		   // Print the list again
		  System.out.println(numbers);
		


	}

}
