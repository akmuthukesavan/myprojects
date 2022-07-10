package exceptionhandling;

import java.util.Scanner;

public class username {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in)) {
			String userName1;
			System.out.println("Enter Username :");
			userName1 = myObj.nextLine();
			System.out.println("Username is " + userName1);
		}
	}

}
