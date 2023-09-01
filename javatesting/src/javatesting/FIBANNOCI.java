package javatesting;

public class FIBANNOCI {

	public static void main(String[] args) {
		
		
		int num=0,num1=1,sum=0;
		
		System. out.print(num+" "+num1);           // 0 1
		
		for(int i=1;i<10;i++)
		{
			sum=num+num1;       // 0+1
			System.out.print("  " +sum);//1
			num=num1;      //1
			num1=sum;    //1
		}
		
		

	}

}
