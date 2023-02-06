import java.util.Scanner;

public class Array_Ques1 {

	public static void main(String[] args) {


		// Create an array from user input and print first/last values

		/*Scanner s1 = new Scanner(System.in);
			 System.out.println(" Please enter size of array :");
			 int size = s1.nextInt();

			 String st1[] = new String[size];

			 for(int i=0;i<=st1.length-1;i++)
			 {
				 System.out.println(" Please enter strings :");
				 st1[i] = s1.next();
			 }
			 System.out.println(" first Element of array :" + st1[0]);
			 System.out.println(" last Element of array :" + st1[st1.length-1]);*/

		// Create an array from user input and Sum the even positions

		/*Scanner s2 = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size1 = s2.nextInt();
		System.out.println("Plese enter your numbers:");

		int a[] = new int[size1];
		try {
			for(int i=0;i<=a.length;i++)
			{
				a[i] = s2.nextInt();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is ocurred and handled");
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
		System.out.println("Sum of the even numbers are:" + " " +sum);*/


		// Create an array from user input and find the highest number
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size2 = s3.nextInt();
		System.out.println("Plese enter your numbers:");

		int b[] = new int[size2];
		try {
			for(int i=0;i<=b.length-1;i++)
			{
				b[i] = s3.nextInt();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is ocurred and handled");
		}
		int high = 1 ;
		for (int j=0;j<=b.length-1;j++)
		{
			if(b[j]>high)
			{
				high = b[j];
			}
		
		}
		System.out.println("Highest number  is " + high);
		
	}

}
