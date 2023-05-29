package week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		int count = data.length;
		System.out.println("Second largest number is: " +data[count-2]);
		
		
		}
		
}
