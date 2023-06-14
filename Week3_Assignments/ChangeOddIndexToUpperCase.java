package week3.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "changeme";
		char[] chArray = str.toCharArray();
	
		System.out.println("Input string = "+str);	
				System.out.print("ChangeOddIndexToUpperCase string = ");
	
				for(int i=0; i<chArray.length; i++)
				{
					if(i%2!=0) {
						System.out.print(Character.toUpperCase(chArray[i]));
					}
					else
						System.out.print(chArray[i]);
					
				}
		
	}
	}


