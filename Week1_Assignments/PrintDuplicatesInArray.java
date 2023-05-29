package week1.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,12,11,15,14,18,16,17,19,18,17,19,20,20};
		int count = arr.length;
		for(int i=0; i<count; i++)
		{
			
			for(int j=i+1; j<count; j++)
				
			{
			if(arr[i]==arr[j])
				System.out.println("Duplicates are: " +arr[i]);
			}
			
			}
		}
		
}
