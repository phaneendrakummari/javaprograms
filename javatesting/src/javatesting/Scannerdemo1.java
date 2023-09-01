package javatesting;

import java.util.Scanner;

public class Scannerdemo1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int x,y;
		double sum,difference,product,quotient;
		
		System.out.println("ENTER NUMBER X");
		x=input.nextInt();
		System.out.println("ENTER NUMBER Y");
		y=input.nextInt();
		
		sum=x+y;
		difference=x-y;
		product=x*y;
		quotient=x/y;
		
		System.out.println("sum of two numbers   : "    +sum);
		System.out.println("differnce of two numbers  : "    +difference);
		System.out.println("product of two numbers  : "    +product);
		System.out.println("quotient of two numbers  : "   +quotient);

	}

}
 