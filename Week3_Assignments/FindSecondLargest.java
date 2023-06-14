package week3.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> data_set =new TreeSet<Integer>();
		for(int i=0; i<data.length; i++)
			
		{
			data_set.add(data[i]);
			
		}
		System.out.println("Set is " +data_set);
		List<Integer> uniq=new ArrayList<Integer>(data_set);
		int size=uniq.size();
		
		System.out.println("List is " +uniq);
		System.out.println("Second largest number is " +uniq.get(size-2));
	}

}
