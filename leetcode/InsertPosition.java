package local;

import java.util.Scanner;

public class InsertPosition {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		nums[i]=sc.nextInt();
		System.out.println("Enter the target");
		int target = sc.nextInt();
		int out = SearchPosition(nums,target);
		System.out.print(out);
		sc.close();
		
	}

	private static int SearchPosition(int[] nums, int target) {
		
		if(nums[0]>target)
			return 0;
		if(target>nums[nums.length-1])
			return nums.length;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
				return i;
			else if(nums[i+1]>target && nums[i]<target)
				return i+1;	
			
			
		}
		
		return 0;
	}
}
