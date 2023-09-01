package javatesting;

public class FACTORIAL {

	public static void main(String[] args) {
	
		
		int num=8;       
		                                                  // 8!=1*2*3*4*5*6*7*8=40320
		int factorial = 1; 
		
		for (int i=1;i<=num;i++)
		{
			factorial = factorial*i;                       //1 
		}
		System.out.println("factorial of 8  "+factorial);
		

	}

}
