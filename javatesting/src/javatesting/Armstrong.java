package javatesting;

public class Armstrong {

	public static void main(String[] args) {
	
		
		int n=407,sum=0,rem=0;
		int temp=n;
		
		while(n!=0)
		{                                                              // 153=1*1*1+5*5*5+3*3*3=153
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp ==sum) 
		{
			System.out.println("number is armstrong number");
		}
		else
		{
			System.out.println("number is not a armstrong number");
		}

	}

}
