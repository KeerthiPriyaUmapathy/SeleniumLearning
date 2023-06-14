package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] text_split = text.split(" ");
		Set<String> text_set =new LinkedHashSet<String>();
for(int i=0; i<text_split.length; i++)
			
		{
			text_set.add(text_split[i]);
			
		}
		System.out.println("Set is " +text_set);
		
	}

}
