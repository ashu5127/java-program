//Write a Java program to iterate through all elements in a array list.  
package code;

import java.util.ArrayList;
import java.util.Iterator;

public class Itreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> colors =new ArrayList <String>();
		colors.add("green");
		colors.add("yellow");
		colors.add("pink");
		colors.add("red");
		colors.add("sky");
		System.out.println(colors);
		Iterator<String> it =colors.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
	  }
		
		
		
		
	}
	}


