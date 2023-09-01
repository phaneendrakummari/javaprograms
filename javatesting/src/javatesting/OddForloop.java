package javatesting;

public class OddForloop {

	public static void main(String[] args) {
		
		int o=805, sum=0;
		
		for(int i=730;i<=805;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of odd numbers is "+sum);
		
	}

}
