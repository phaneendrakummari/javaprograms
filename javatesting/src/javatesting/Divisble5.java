package javatesting;

public class Divisble5 {

	public static void main(String[] args) {
		
		
		int num=50;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(i%5==0)
			count++;
		}
		System.out.println("divisble numbers are:"+count );
		

	}

}
