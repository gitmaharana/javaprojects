import java.util.Scanner;

public class Reversestring_number {

	public static void main(String[] args) 

	{
		// WAP to reverse a number using StringBuffer and StringBuilder option

		// Create object of StringBuffer class and convert number into String
		int num = 44455555;
		StringBuffer sbf = new StringBuffer(String.valueOf(num));// 
		// Use reverse method
		StringBuffer rev = sbf.reverse();
		System.out.println("Reverse Number is :" +rev);



		// WAP to reverse a number using String Builder class and user input
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int num2 = sc1.nextInt();

		StringBuilder sbd = new StringBuilder();
		sbd.append(num2);
		StringBuilder rev2  = sbd.reverse();
		System.out.println("New reverse number is :"+rev2);


		// creating scanner class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int num1 = sc.nextInt();

		// Using StringBuffer class to reverse a string
		StringBuffer buff1 = new StringBuffer(String.valueOf(num1));
		StringBuffer rev1 = buff1.reverse();
		System.out.println("New reversed number is :"+rev1);


	}
	
}

