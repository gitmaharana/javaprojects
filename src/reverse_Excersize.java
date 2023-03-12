import java.util.Scanner;

public class reverse_Excersize {

	public static void main(String[] args) {
		// Swap two numbers  - with third variables

		int a = 100;
		int b = 200;
		int c;

		//c = a;// a value copied to c
		//a = b;// a value copied to c
		//b = c;// a value copied to c

		//System.out.println("Code with third variables");
		//System.out.println("value of a is :" + a);
		//System.out.println("value of b is :" + b);


		// Swap two numbers  - without third variables

		//a = a+b;//300
		//b = a-b;//100
		//a = a-b;//200
				
		//System.out.println("Code without third variables");
		//System.out.println("value of a is :" + a);
		//System.out.println("value of b is :" + b);
		
		// How to reverse any number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		long rev = 0;
		
		while(num>0) 
		{
			rev = rev * 10 + num%10;
			num = num/10;		
		}
		System.out.println("Reverse number is :" +rev);
		
		
		
		
		

	}

}
