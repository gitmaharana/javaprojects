import java.util.Scanner;

public class Array_Demo1 {

	public static void main(String[] args) {

		//An array is collection of homogenous elements(data).
		//Whenever we want to use multiple or group of elements or data at same time we go for arrays.
		
		// If you know the element of arrays then you should declare using new keyword
		
		int a[] = new int[5];
		
		//now initialize values for each array
		
		a[0] = 100;
		a[1] = 100;
		a[2] = 100;
		a[3] = 100;
		a[4] = 100;
		//a[-1]= 400; will throw error
		//a[5] = 100; can't initiate values more than total assigned arrays like 5 in this case
		
		System.out.println("Element of this array are" + " " + a[1]);
		
		// If you don't know the element of arrays then you should declare all values in side {}
       int b[]={10,22,33,44,555,666,7777,88};
				
		// Length of this array
		System.out.println("Length of this array is" + " " + b.length);
		
		// Print the array using for-each loop
		String s[]= {"John","Rohan","Roman","Riya","Sneha"};
		
		for(String data:s)
		{
			System.out.println(data);
		}
		
		// Print the array using for loop
		 int d[]={10,22,33,44,555,666,7777,88};
		 
		 for(int i=0; i<=d.length-1;i++)//Use length -1 since length starts from 1 & array index from 0
		 { 
			 System.out.println(d[i]);
		 }

			// Print the array in reverse order using for loop
		 String e[]= {"Harry","Sam","Suman","Roy","Sean","Annie"};
		 System.out.println("Length of this array is" + " " + e.length);
		 
		 for(int k=e.length-1;k>=0;k--)//Use length -1 since length starts from 1 & array index from 0
			 
		 {
			System.out.println(e[k]);
		 }
		 
		// Create an array from user input and print first/last values
	
		 Scanner s1 = new Scanner(System.in);
		 System.out.println(" Please enter size of array :");
		 int size = s1.nextInt();
		 
		 String st1[] = new String[size];
		 
		 for(int i=0;i<=st1.length-1;i++)
		 {
			 System.out.println(" Please enter strings :");
			 st1[i] = s1.next();
		 }
		 System.out.println(" first Element of array :" + st1[0]);
		 System.out.println(" last Element of array :" + st1[st1.length-1]);
	
	
	}

}
