package javatesting;

public class Evenfor {

	public static void main(String[] args) {
		
		
		
	/*	int num=840;
		System.out.println("list of even numbers ");
		for(int i=637;i<=num;i++)
		{
			if(i%2==0)  
			{
				System.out.println(i +"  ");
			}
		}*/
		
		int e =20 ,sum=0;
		
		for (int i=2;i<=20;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("the sum of even numbers from 1 to 20 is   "  +sum);
		

	}

}
