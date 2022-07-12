package array;

import java.util.Scanner;

public class Arrayfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//Scanner cs = new Scanner(System.in);
		
		int i = 0;
		//int len = sc.nextInt();
		int[] present = new int[5]; 
		
		//boolean ss = false;
		while (i<present.length)
		{
			System.out.println("Enter No. ");
			present[i] = sc.nextInt();
			i++;
		}
		//	if(present[i] == cs)
			//{
				//ss = true;
			//	System.out.println("No. is present at position " + i);
			//	break;
		System.out.println("No's Value at position ");
		for(i=0;i<present.length;i++)
		{
			System.out.println(present[i]);
			}
}
//		if(ss == false)
	//	{
		//	System.out.println("No. is not present in the array");
		//}
	//}

}
