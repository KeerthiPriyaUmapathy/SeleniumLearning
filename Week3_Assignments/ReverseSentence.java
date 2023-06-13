package week3.assignments;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "This is my Selenium automation course";
		String[] str_split = str.split(" ");
		System.out.println("Input sentence = "+str);	
				System.out.print("Reverse sentence = ");
	
				for(int i = str_split.length-1; i>=0; i--)
				{
					System.out.print(" " +str_split[i]);
				}
		
	}
	}


