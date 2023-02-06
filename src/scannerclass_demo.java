import java.util.Scanner;

public class scannerclass_demo {


	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s1.nextLine();// String input with space// Rajendra Maharana
		System.out.println("My Name is :"+name);
		
		System.out.println("Enter your full name");
		String nameline = s1.next();// String input without space// Rajendra
		System.out.println("My Name is :"+nameline);
		
		System.out.println("Enter your gender");
		char ch1 = s1.next().charAt(0);// Character input Male/Female
		System.out.println("My Name is :"+ch1);
		
		System.out.println("Enter percentage ");
		float percentage=s1.nextFloat();
		System.out.println("Score : "+percentage);// Float input 
		
		System.out.println("Enter result status ");
		boolean result=s1.nextBoolean();//Boolean input 
		System.out.println("Result: "+result);
		
		System.out.println("Enter contact number ");
		long contact=s1.nextLong();//Long input
		System.out.println("Contact : "+contact);
		

	}

}
