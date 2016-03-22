package local;

import java.util.Scanner;

public class CompareVersion {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first version");
		String v1 = sc.nextLine();	
		System.out.println("Enter the second version");
		String v2 = sc.nextLine();
		int out = check(v1,v2);
		System.out.println(out);
		sc.close();
		
	}

	private static int check(String v1, String v2) {
		
		String[] part1 = v1.split("\\.");
		String[] part2 = v2.split("\\.");
		int i=0;
		for(i=0;i<part1.length&&i<part2.length;i++)
		{
			if(Integer.valueOf(part1[i])> Integer.valueOf(part2[i]))
				return 1;
			if(Integer.valueOf(part1[i])< Integer.valueOf(part2[i]))
				return -1;
		}
		
		if(part1.length == part2.length) return 0;
        String[] rest = part1.length > part2.length ? part1 : part2;
        for(; i < rest.length; i++){
            if(Integer.valueOf(rest[i]) > 0){
                if(part1.length > part2.length) return 1;
                else return -1;
            }
        }
        return 0;

		
	}
}
