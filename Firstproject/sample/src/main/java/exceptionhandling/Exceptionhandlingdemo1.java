package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandlingdemo1 {

	public static void main(String[] args) {
		
		Exceptionhandlingdemo1 ed = new Exceptionhandlingdemo1();
		ed.divide();
		ed.add();
	}

	private void add() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			int result = no1+no2;
			System.out.println("Addtional is " + result);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only numberic");
			add();
		}
		finally {
			System.out.println("Finally block");
		}
	}
		
	private void divide() {
		
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number : ");
		try {	
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			int result = no1/no2;
				System.out.println("Division result is " + result);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("no2 is zero. Please check no2 Value");
				divide();
			}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only numberic");
			divide();
		}
		catch(Exception e)
		{
			System.out.println("Unknown Reasons");
			divide();
		}
		
	}
		//add();
}	
