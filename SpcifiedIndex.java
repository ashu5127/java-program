// Write a Java program to retrieve an element (at a specified index) from a given array list.  

package code;

import java.util.ArrayList;
import java.util.List;

public class SpcifiedIndex {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> colors =new ArrayList <String>();
		colors.add("red");
		colors.add("pink");
		colors.add("blue");
		colors.add("green");
		colors.add("sky");
		System.out.println(colors);
	
		System.out.println("The element at index in the ArrayList is: " + colors.get(2));
		}
		

	}

