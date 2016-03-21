package leetcode;

import java.util.Scanner;
import java.util.*;


public class Paranthesis {

	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String in = sc.next();
		
		Boolean out = findMatch(in);
		System.out.println(out);
		sc.close();
		
	}

	private static boolean findMatch(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		 char temp;
		    for(int i=0;i<s.length();i++)
		    {
		    if(s.charAt(i)=='('|| s.charAt(i)=='[' || s.charAt(i)=='{')
		        stack.push(s.charAt(i));
		        
		    else 
		       {
	    	        if(!stack.isEmpty())
	    	        {
	    	        	temp = stack.pop();
	        	        if(s.charAt(i)- temp > 0 && s.charAt(i)- temp <=2)
	        	        continue;        	        
	    	         }
	    	        return false;
		       }       		       
		    }
		    
		    return (stack.isEmpty());

}

}
