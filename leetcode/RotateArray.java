package local;
import java.util.*;

public class RotateArray {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		arr[i] = sc.nextInt();
		System.out.println("Enter the number of rotations");
		int rotations = sc.nextInt();		
		Rotate(arr,rotations);
		sc.close();
		
	}

	 static void Rotate(int[] nums, int k) {
		
		int n = nums.length;
		k = n==0?0:k%n;
		
		reverse(nums,0,n-k);
		reverse(nums,n-k,n);
		reverse(nums,0,n);
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
			System.out.print(" ");	
		}
	
	}

	private static void reverse(int[] nums, int left, int right) {
		int temp=0;
		right--;
		while(left<right)
		{
			temp = nums[right];
			nums[right]= nums[left];
			nums[left]= temp;
			left++;
			right--;
		}
	}
}
