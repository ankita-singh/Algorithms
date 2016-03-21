package leetcode;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String in = sc.next();	
		Boolean out = Check_Palindrome(in.toUpperCase());
		System.out.println(out);
		sc.close();
		
	}

	private static Boolean Check_Palindrome(String s) {
	   
		int start=0;
		int end = s.length()-1;
		s = s.toLowerCase();
		
		while(start < end)
		{
			while(start<end && !Character.isLetterOrDigit(s.charAt(start)))
				start++;
			while(start<end && !Character.isLetterOrDigit(s.charAt(end)))
				end--;
			
			if(s.charAt(start)== s.charAt(end))
				{
					start++;
				    end--;
				}
				
			else
				return false;		
		}
	
		return true;
	}

}
