package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		for (int i = 0; i < 5; i++) {
		strings.add("string #" + i);
		System.out.println(strings.get(i));
		}
		
		//3. Print all the Strings using a standard for-loop
		//4. Print all the Strings using a for-each loop
		for (String bon : strings) {
			System.out.println(bon);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			//strings.add("string #" + i);
			System.out.println(strings.get(i));
			}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
