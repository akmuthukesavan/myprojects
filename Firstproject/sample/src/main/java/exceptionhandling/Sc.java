package exceptionhandling;

import java.util.Scanner;

public class Sc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();

		int result = no1+no2;
		System.out.println(result);

	}

}
