// Write a Java program to insert an element into the array list at the first position
package code;
import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> numbers = new ArrayList<String>();
		try {
		numbers.add("red");
		numbers.add("yellow");
		numbers.add("blue");
		numbers.add("green");
		numbers.add("sky");
		System.out.println(numbers);
		numbers.add(0,"pink");
		System.out.println(numbers);
		}
		catch(Exception e) {
		

	}

}
}




