import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter first number :");
   int num1 = sc.nextInt();
   
   /*Scanner sc1 = new Scanner(System.in);
   System.out.println("Enter second number :");
   int num2 = sc1.nextInt();
   
   Scanner sc2 = new Scanner(System.in);
   System.out.println("Enter third number :");
   int num3 = sc2.nextInt();
   
   Scanner sc3 = new Scanner(System.in);
   System.out.println("Enter fourth number :");
   int num4 = sc3.nextInt();*/
   
   int even_sum = 0;
   int odd_sum = 0;
   
   while(num1>0)
   {
	   int rem = num1%10;
	   if(rem%2==0)
	   {
		   even_sum = rem + even_sum;	  
	   }
	   else 
	   {
		   odd_sum = rem + odd_sum;
	   }
	   num1 = num1/10;
	 
   }
   
   System.out.println("sum of even number is :" +even_sum);
   System.out.println("sum of odd number is :" +odd_sum); 
   
  
   
	}

}
