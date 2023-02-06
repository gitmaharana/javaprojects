import java.util.Scanner;

public class Largestof3numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter second number:");
		int num2 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter third number:");
		int num3 = sc2.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Largest number is :" +num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Largest number is :" +num2);	
		}
		else
		{
			System.out.println("Largest number is :" +num3);
		}
		
		// define largest number using Ternary operator
		
		int largest = num1>num2? num1:num2;
		int largest1 = largest>num3? largest:num3;
		
		System.out.println("largest number is :"+largest1);
		
		// Write Ternary operator in one statement
		
		int largest2 = num3> (num1 > num2?num1:num2)? num3:(num1 > num2?num1:num2);
		System.out.println("largest number is :"+largest2);
		
		
		

	}

}
