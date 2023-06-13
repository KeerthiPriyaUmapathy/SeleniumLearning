package week3.assignments;

public class ReverseEvenWords_1 {

	public static void main(String[] args) {
		String str = "I am a software tester"; 
			System.out.println("Input string = " +str);
			System.out.print("Reverse Even words = ");
		
		String[] str_split = str.split(" ");
		for(int i=0;i<(str_split.length); i++)
		{
			if(i%2!=0) {
				char[] chArray = str_split[i].toCharArray();
				for (int j=chArray.length-1; j>=0; j--)
				{
					System.out.print(chArray[j]);
				}
			}
			else
				
				System.out.print(" " +str_split[i]+ " ");
		}	
		}
		
	
						
					
}


				
	