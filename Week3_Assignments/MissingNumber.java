package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {1,2,4,3,5,6,7,9,10};
		Set<Integer> data_set =new TreeSet<Integer>();
		for(int i=0; i<data.length; i++)
			
		{
			data_set.add(data[i]);
			
		}
		System.out.println("Set is " +data_set);
		List<Integer> uniq=new ArrayList<Integer>(data_set);
		for(int j=1; j<uniq.size()-1; j++)
		{
			if(uniq.get(j+1) != (uniq.get(j)+1))
			{
				System.out.println(j+2);
			}
			}
				
		}
		
	
}
