package javatesting;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int num=1646;
		int rev=0 , rem;
		int temp=num;
		
		while (num!=0)
		{
			rev = rev* 10 +num%10;
			num =num/10;
			
		}
		if(temp==rev)
		{
		    System.out.println("number is palindrome:"  +rev);
		}
		else
		{
			System.out.println("number is not a palindrome" +rev);
		}

	}    

}
