import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size1 = s2.nextInt();
		System.out.println("Plese enter your numbers:");

		int a[] = new int[size1];
		try {// Try catch  concept for exception handling
			for(int i=0;i<=a.length;i++)
			{
				a[i] = s2.nextInt();
			}
		}
		catch(Exception e)// Catch block concept for exception handling
		{
			System.out.println("Exception is ocurred and handled"); //Exception handling statement
		}
		int sum =0;
		for(int j=0;j<=a.length-1;j++)

		{
			if(a[j]%2==0)
			{
				System.out.println("Even numbers are:" + " " +a[j]);
				sum = sum+a[j];
			}
		}
		System.out.println("Sum of the even numbers are:" + " " +sum);

	}

}
