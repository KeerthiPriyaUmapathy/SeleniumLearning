package week1.assignments;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count = arr.length;
		for(int i=1; i<count; i++)
		{
			
			if(i!=arr[i-1])
			{
			System.out.println("Missing numbers are: " +i);
			break;
			}
			}
			
		
		}
		
}
