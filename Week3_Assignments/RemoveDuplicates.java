package week3.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "We learn We java basics sessions as part as of java sessions in java week1";	
		int count=0;
		System.out.println("Input string = " +str);
		
		String[] str_split = str.split(" ");
		for(int i=0;i<(str_split.length); i++)
		{
			for(int j=i+1;j<(str_split.length);j++)
			{
				if(str_split[i].equals(str_split[j]))
					{
					str_split[j]="";			
			}
			}
		}
		System.out.print("Output string = ");
		for(int k=0; k<(str_split.length); k++)
		{
		System.out.print(" " +str_split[k]);
		}	
						
					
}

}
				
	