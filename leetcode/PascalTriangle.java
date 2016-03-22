package local;

import java.util.*;

public class PascalTriangle {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		List<List<Integer>> out = pascal(n);
		
		
		for(List<Integer> str : out)
		{
			
			for(int i=0;i<str.size();i++)
			{
				System.out.print(str.get(i));
				System.out.print(" ");
			}
			System.out.println();
		}				
		sc.close();	
	}

	private static List<List<Integer>> pascal(int n) {
		
		 List<Integer> row = new ArrayList<Integer>();
			List<Integer> pre = new ArrayList<Integer>();
			List<List<Integer>> res = new ArrayList<List<Integer>>();
			
			for(int i=0;i<n;i++)
			{
				row = new ArrayList<Integer>();
				for(int j =0;j<=i;j++)
				{
					if(j==0||j==i)
						row.add(1);
					else
						row.add(pre.get(j-1)+pre.get(j));
				}
				pre = row;
				res.add(row);
			}
			
			return res;
		
		/*List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
        for (int i = 0; i < n; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j - 1) + pre.get(j));
            pre = row;
            res.add(row);
        }
        return res;*/
	}
}
