import java.util.Scanner;

public class palindrome_count_sum {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();

		int temp = num;//since number value will change so temp created to keep original value
		int rev = 0 ;

		while(num>0)
		{ 
			rev = rev*10 + num%10;
			num = num/10;
		}

		System.out.println("reverse number is : " +rev);
		System.out.println("current number is : " +temp);

		if(temp==rev)	
		{
			System.out.println("This is a Palindrome number");
		}
		else
		{
			System.out.println("This is Not a Palindrome number");
		}

		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Enter a string");
		String str1 = sc.next();
		String rev1 ="";
		int num1 = str1.length();
		
		System.out.println("length of this string is" +" "+  num1);
		
		for(int i=num1-1;i>=0;i--)
		{
			rev1 = rev1 + str1.charAt(i);
		}
		
		System.out.println( "Reversed string is" +" "+ rev1);
		System.out.println( "Actuall string is" +" "+ str1);
		
		if(rev1.equals(str1))	
		{
			System.out.println("This is a Palindrome string");
		}
		else
		{
			System.out.println("This is Not a Palindrome string");
		}
		

	}

}
