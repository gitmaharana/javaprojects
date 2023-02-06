import java.util.Scanner;

public class StringsQues1 {

	public static void main(String[] args) {

		//Reverse a user define strings

		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter any string to reverse");
		String n1 = s1.next();
		System.out.println("Length of this string is :" + n1.length());

		String rev = null;
		for(int i=n1.length()-1;i>=0;i--)//length value should be -1 since length value should be same as charAt
		  {
			rev = rev+n1.charAt(i);//char value should be  same as length value
		  }
		System.out.println("Reversed string is"+rev);
		
		System.out.println("----------------------------------------------------------------------------");


		//  ||  -- OR symbol
		// Print & count Vowel of any User provided string
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Please enter any string to reverse");
		String n2 = s1.next();
		System.out.println("Length of this string is :" + n2.length());
		int count = 0;
		for(int i= 0;i<n2.length();i++)

		{
			if(n2.charAt(i) == 'a' ||n2.charAt(i)=='e'||n2.charAt(i)=='i'||
					n2.charAt(i)=='o'||n2.charAt(i)=='u' )
			{
				System.out.println(n2.charAt(i));
				count++;
			}
		}
		System.out.println("Count of vowels in smaller case is : "+ count);
	} 


}
