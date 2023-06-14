package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		
		String text = "babu";
		char[] chArray = text.toCharArray();
		Set<Character> ch=new LinkedHashSet<Character>();
		Set<Character> duch=new LinkedHashSet<Character>();
		
		for(Character c:chArray) {			
			if(!ch.add(c)) {
				duch.add(c);
			}
		}
		System.out.println("Input Set values = " +ch);
		System.out.println("Duplicate set values = " +duch);
		ch.removeAll(duch);
		System.out.println("Unique characters " +ch);
	}

}
