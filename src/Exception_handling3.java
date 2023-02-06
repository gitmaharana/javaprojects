import java.util.Scanner;

/*public class Exception_handling3 {

	public static void voterlist(int age) 
	{
		if (age<20)
		{
			throw new ArithmeticException("He is small kid - enjoying life");
			//we can create our own exception object by using throw keyword
			//throw keyword is mainly used for user defined exceptions
		}
		else
		{
			System.out.println("Voter is not a kid..go please vote ");
		}

	}

	public static void main(String[] args) {

		voterlist(100);//directly calling method since method is static so no object created

	}*/


//This  is the another user define exception
//When pre-define exceptions does not fulfill our requirement, we will go for user-define exception i.e we can create our exceptions. 
//Such type of exception is called as User define Exceptions (or) Customized Exceptions.
//create our Exception class and that class should be or must be extending either throwable/Exception/RuntimeException classes

public class Exception_handling3 extends RuntimeException
{
	public Exception_handling3(String msg)// constructor created without any return type
	
	{
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
	
		System.out.println("Enter the available balance amount :");
		Scanner s1 = new Scanner(System.in);
		double availbal = s1.nextDouble();
		System.out.println("Enter the withdrawl amount :");
		double withdr = s1.nextDouble();
		
		if (withdr>availbal)
		{
			throw new Exception_handling3("Exceeding the limit");//condition with Throw exception
		}
		else
		{
			System.out.println("Please collect your money");
		}

	}  

}
