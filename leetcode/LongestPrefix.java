package local;

import java.util.*;

	public class LongestPrefix {
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number of strings");
			int n = sc.nextInt();
			String[] strs = new String[n];
			System.out.println("Enter the strings");
			for(int i=0;i<n;i++)
			strs[i] = sc.next();
			
			String out = FindLongestPrefix(strs);
			System.out.println(out);
			sc.close();
			
		}

		private static String FindLongestPrefix(String[] strs) {
			
			int shortest = strs[0].length();
			int maxlen =0;
			for(int i=1;i<strs.length;i++)
				{
					if(strs[i].length()< shortest)
						shortest = strs[i].length();
				}
			int answer = shortest;
			
			for(String str:strs)
			{
				maxlen = 0;
				for(int i=0;i<shortest;i++)
				{
					if(str.charAt(i)== strs[0].charAt(i))
						maxlen++;
					else
						break;
				}
				shortest = Math.min(maxlen, shortest);
			}
			
			return strs[0].substring(0,shortest);
			 
		}
}
