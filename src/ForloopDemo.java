import java.util.Scanner;

public class ForloopDemo {

	public static void main(String[] args) {

		//int num = 10; // hardcoded

		Scanner s1 = new Scanner (System.in); // User input 
		System.out.println("Enter number");
		int age = s1.nextInt();

		for (int i = 1; i<=10;i++)

		{
			System.out.println(age + " X "+  i +" = "+ age *i );

		}
		

		   
		   
		   
		   
		   }  

}
