package local;

import java.util.Scanner;
import java.util.*;


	public class RomanToInteger {
		public static void main(String[] args)
		{
			System.out.println("Enter the string");
			Scanner sc= new Scanner(System.in);
			String in = sc.next();
			
			int out = convert(in);
			System.out.println(out);
			sc.close();
			
		}

		private static int convert(String s) {
			
			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
			map.put('Z', 0);
			map.put('I',1);
			map.put('V',5);
			map.put('X',10);
			map.put('L', 50);
			map.put('C', 100);
			map.put('D', 500);
			map.put('M', 1000);
			
			int previous =0;
			int current=0;
			int result =0;
			
			
				s = s+"Z";
			for(int i=s.length()-1;i>=1;i--)
			{
				current = map.get(s.charAt(i));
				//System.out.println(current);
				previous = map.get(s.charAt(i-1));
				//System.out.println(previous);
				result = result + (current<=previous? previous : -previous);
				
			}
			
			return result;
		}
}
