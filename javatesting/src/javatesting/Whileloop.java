package javatesting;

public class Whileloop {

	public static void main(String[] args) {
	
		
		 /* int i=1;
		
		//  while(i<=100) {
			//System.out.println(i);
			//i++;               */
		int num=1986;
		
		int rem;
		
		int rev =0;
	
		
		while(num>0)
		{
		
			rem = num%10;
			num = num/10;
			rev = rev*10+rem;
		}
		
		System.out.println(rev);

	}

}
