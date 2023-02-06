import java.util.Scanner;

public class Ifdemo {

	public static void main(String[] args) {
		
		//int a = 20;
		//int b = 30;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a1 = s1.nextInt();
		
		System.out.println("Enter second Number");
		int a2 = s1.nextInt();
		
		
		if(a1>a2)
		{
			System.out.println("a1 is higher");
		}
		else
		{
			System.out.println("a2 is higher");
		}
	}

}
 