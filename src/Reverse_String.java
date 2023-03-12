import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) 

	{
		
		// using concatenation method and character array method
		Scanner sc1 = new Scanner(System.in);
		System.out.println(" Please enter your string :");
		String str = sc1.next();

		int strl = str.length();
		String rev= "";
		for(int i=strl-1;i>=0;i--) 
			
		   { 
			rev= rev +str.charAt(i);
		   }
		System.out.println("Reversed string is:"+rev);
		
		// reverse using Char to array operation
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter your string :");
		String str1 = sc2.next();
		
		char a[]= str1.toCharArray();
		int len = a.length;
		String rev1 ="";
		
		for(int i = len-1;i>=0;i--) 
		{
			rev1 = rev1+a[i];
		}
		System.out.println("Reversed string is :"+rev1);
		
	}
	
}
