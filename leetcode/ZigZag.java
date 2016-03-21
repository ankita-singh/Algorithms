package leetcode;

import java.io.*;
import java.util.*;

public class ZigZag {

	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String in = sc.next();
		
		System.out.println("Enter the number of rows");
		int numRows = sc.nextInt();
		
		String out = findZigZag(in,numRows);
		System.out.println(out);
		
	}
	
	

	public static String findZigZag(String s, int numRows )
	{
		int len = s.length();
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0; i<numRows; i++)
        {
             sb[i] = new StringBuffer();
        }
    
	    int i=0;
	    while( i < len )
	    {
	        
	        for(int x = 0;x<numRows && i<len ;x++)
	        {
		  
		         	sb[x].append(s.charAt(i));
		            i++;
		            
	        }
	      
	     for(int x=numRows-2; x>=1 && i<len ;x--)
	      
	     {
	            sb[x].append(s.charAt(i));
	            i++;
	        }
	        
	    }
    
	    for(int j=1;j<numRows;j++)
	    {
	        sb[0].append(sb[j]);
	    }
	    
     return sb[0].toString();
}
	
}



