package javatesting;

public class Primecheck {

	public static void main(String[] args) {
		// prime number - a number is divisible only by 1 and itself
		
		int num=7;
		int count=0;
	
		
		for (int i=1;i<=num;i++)
		{
		     if(num%i==0)
		    	 count++;
		}
		if(count==2) 
		{
			System.out.println("number is a prime number");
		}
		else
		{
			System.out.println("number is not a prime number");
		}
		
	}
		
}

