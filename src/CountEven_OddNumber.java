import java.util.Scanner;

public class CountEven_OddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num1 = sc.nextInt();

		int even_count = 0;
		int odd_count = 0;

		while(num1>0)
		{
			int rem = num1%10;// idetifies the remainder value from number
			if(rem%2==0)// calculates if remainder is even or odd
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num1= num1/10; //divide the number and looped back 

		}
		System.out.println("Overall even count is :"+even_count);
		System.out.println("Overall odd count is :"+odd_count);

	}

}
