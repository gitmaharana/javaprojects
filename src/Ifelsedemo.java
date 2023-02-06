import java.util.Scanner;

public class Ifelsedemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age>=1 && age<10)
		{
			System.out.println("You are a child");
		}
		else if(age>=11 && age<30)
		{
			System.out.println("You are an adult");
		}
		else if(age>=60 && age<99)
		{
			System.out.println("You are an super senior");
		}
		else
		{
			System.out.println("You are not a human");
		}
	}
	
}
