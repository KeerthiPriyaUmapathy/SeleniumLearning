package week1.assignments;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check Prime or Not6");
		int n = sc.nextInt();
		System.out.println("Entered number is: " +n);
		 if(n==0||n==1){  
			 System.out.println(n + " is Not a prime number");     
			  }
		 else
		 {
		
		for(int i=2; i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n + " is NOT a prime number");
			break;
			}
			else
			{
			System.out.println(n + " is a prime number");
			break;
			}
		}	
				
		}
	}

}
