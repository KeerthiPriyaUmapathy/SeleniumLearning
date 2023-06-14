package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		String text = "PayPal India";
		System.out.println("Input string = " +text);
		char[] chArray = text.toCharArray();
		Set<Character> chset=new LinkedHashSet<Character>();
Set<Character> duchset=new LinkedHashSet<Character>();
		
		for(Character c:chArray) {			
			if(!chset.add(c)) {
				duchset.add(c);
			}
		}
		System.out.println("After removing duplicates" +chset);
		//System.out.println(duchset);
	}

}
