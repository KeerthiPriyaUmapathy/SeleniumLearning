package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] str = {"Aspire Systems", "HCL", "Wipro", "CTS"};
		 List<String> strList = new ArrayList<String>();
		 strList.addAll(Arrays.asList(str));
		Collections.sort(strList);
		int strlen = strList.size();
		System.out.println("Input = " +strList);
		List<String> outputList = new ArrayList<String>();
for(int i=strlen-1; i>=0; i--)
	{
	outputList.add(strList.get(i));
	}
System.out.print("Output = " +outputList);
//		}
		

}
}
