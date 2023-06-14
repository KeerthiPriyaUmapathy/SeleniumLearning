package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {1,2,4,3,5,6,7,9,10,11,12,13,15,17};
		Set<Integer> data_set =new TreeSet<Integer>();
		for(int i=0; i<data.length; i++)
			
		{
			data_set.add(data[i]);
			
		}
		System.out.println("Set is " +data_set);
		List<Integer> uniq=new ArrayList<Integer>(data_set);
		for(int j=0; j<uniq.size(); j++)
		{
		
			if(uniq.get(j) != (j+1))
			{
				System.out.println(j+1);
				break;
			}
			}
				
		}
		
	
}
