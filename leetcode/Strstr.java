package local;

import java.util.Scanner;

public class Strstr {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the haystack");
		String haystack = sc.nextLine();	
		System.out.println("Enter the needle");
		String needle = sc.nextLine();
		int out = check(haystack,needle);
		System.out.println(out);
		sc.close();
		
	}

	private static int check(String haystack, String needle) {
		
		for(int i=0;i<haystack.length()-needle.length()+1;i++)
		{
			if(haystack.substring(i, i+needle.length()).equals(needle))
				return i;
			
		}
		return -1;
	}
}
