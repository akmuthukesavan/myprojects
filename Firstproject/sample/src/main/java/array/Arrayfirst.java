package array;

import java.util.Scanner;

public class Arrayfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of person");
		int count = sc.nextInt();
		int[] total = new int[count];
		int i = 0;
		while(i<count)
		{
			System.out.println("Enter numbers");
			total [i]= sc.nextInt();
			i++;
		}
		for(i=0;i<count;i++) {
			System.out.println(total[i]);
		}
	}
		

}
