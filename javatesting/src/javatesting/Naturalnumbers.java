package javatesting;

public class Naturalnumbers {

	public static void main(String[] args) {
		
		
	/*	int num = 100;
		
		System.out.println("print natural numbersfrom 1 to"+num);
		
		for (int i=1;i<=num;i++) {
			
			System.out.print(i+"  ");
		}*/
		
		int num =15,sum=0;
		System.out.println("print natural numbersfrom 1 to"+num);
		
		for(int i=1;i<=num;i++) {
			System.out.print(i+"  ");
			sum=sum+i;
			
		}
		
		System.out.println("sum of first "+num + "natural numbers"+sum);
		
		
		
		
		

	}

}
