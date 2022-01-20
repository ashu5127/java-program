//Write a Java program to insert an element into the array list at the first position.  
package code;

import java.util.ArrayList;

public class InsretElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> colors =new ArrayList <String>();
		colors.add("green");
		colors.add("yellow");
		colors.add("pink");
		colors.add("red");
		colors.add("sky");
		System.out.println(colors);
		colors.add(0,"pink");
		System.out.println(colors);
		

	}
}