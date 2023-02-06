import java.util.Scanner;

public class Countdigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number:");
		int num1 = sc.nextInt();
		
		int count = 0;
		
		while(num1>0)
		{
			num1=num1/10;
			
			count++;
		}
         System.out.println("Total count of the digit is :"+count);
	}

}
