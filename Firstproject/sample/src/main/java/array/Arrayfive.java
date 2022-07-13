package array;

import java.util.Scanner;

public class Arrayfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the Value of position  ");
		int lent = cs.nextInt();
		
		Scanner ar = new Scanner(System.in);
		System.out.println("Enter the Array  ");
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int len = ar.nextInt();
		int[] present = new int[len]; 
		
		boolean ss = false;
		while (i<present.length)
		{
			System.out.println("Enter the Value  ");
			present[i] = sc.nextInt();
			//i++;
			//System.out.println("lent  " +lent);
			if(present[i] == lent)
			{
				ss = true;
				System.out.println("No. is present at position " + (i+1));
				break;
			}
			i++;
		//System.out.println("No's of Value ");
		//for(i=0;i<present.length;i++)
		//{
		//	System.out.println(present[i]);
		//}
				
		if(ss == false)
		{
			System.out.println("No. is not present in the array  ");
		}
			
	}

	}

}