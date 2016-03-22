package local;

import java.util.Scanner;

public class LastWord {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String in = sc.nextLine();	
		int out = FindLastWordLength(in);
		System.out.println(out);
		sc.close();
		
	}

	private static int FindLastWordLength(String s) {
		
		int count =0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)== ' ')
				break;	
			count++;
		}
		return count;
	}
}
