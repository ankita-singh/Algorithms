package local;
import java.util.*;

public class StrRev {

	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String in = sc.nextLine();
		
		String out = Reverse(in);
		System.out.print(out);
		sc.close();
		
	}

	private static String Reverse(String in) {
		
		int left = 0;
		int right = in.length();
		char temp = '\0';
		char[] array = in.toCharArray();
		
		
		while(left<right)
		{
			temp = array[left];
			array[left] = array[right-1];
			array[right-1]= temp;
			right--;
			left++;
		}
		
		
		return String.valueOf(array);
	}
}
