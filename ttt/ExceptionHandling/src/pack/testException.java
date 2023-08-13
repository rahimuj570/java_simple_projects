package pack;

import java.util.InputMismatchException;
import java.util.Scanner;
public class testException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		float div;
		try {
			 a = sc.nextInt();
			 b = sc.nextInt();
			
			div = a/b;
			System.out.println("Result is "+div);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please input an integer");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please input non zero value");
			a = sc.nextInt();
			b = sc.nextInt();
			div = a/b;
			System.out.println("Result is "+div);
			
			
		}
		
	
	}

}
