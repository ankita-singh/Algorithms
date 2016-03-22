package local;
import java.util.*;

public class TwoSum {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		arr[i] = sc.nextInt();
		System.out.println("Enter the target");
		int target = sc.nextInt();
		
		int[] out = FindIndices(arr,target);
		
		System.out.println(out[0]+" "+out[1]);
		sc.close();
		
	}

	private static int[] FindIndices(int[] nums, int target) {
		
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	int[] res = new int[2];
	
		for(int i =0;i<nums.length;i++)
		{
			if(map.containsKey(nums[i]))
			{
				res[1] = i;
				res[0] = map.get(nums[i]);
			}
			else
			{
				map.put(target-nums[i], i);
			}
				
		}
		return res;
}
}
