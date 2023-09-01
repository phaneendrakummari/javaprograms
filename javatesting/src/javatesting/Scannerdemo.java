package javatesting;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("Enter your name");
		System.out.println("Enter your age");
	    System.out.println("enter your salary");
	    System.out.println("enter empolyee id");
	    System.out.println("enter organization");
		
		String name = sc.nextLine();
		int age =sc.nextInt();
		
		int salary=sc.nextInt();
		int empid=sc.nextInt();
		String org = sc.nextLine();
		
		System.out.println(" my Name is  : "  +name);
		System.out.println("age is :   " +age);
	     System.out.println("salary is : " +salary);  
	     System.out.println("my employee id is :"  +empid);
	     System.out.println("my organization is :"  +org);
				
		
		/* Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number1");
		System.out.println("Enter number2");
		int num;
		
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		num=number1+number2;
		
		System.out.println("additionof two numbers :" +num); */
		
		
		
		
		
		

	}

}
