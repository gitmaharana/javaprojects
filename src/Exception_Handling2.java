
public class Exception_Handling2 {

	public static void main(String[] args) throws InterruptedException {
		// throws will declare exception in method block and it means method will not handle exception its JVM will handle the exception called exception propagation

		int a = 100;
		int b = 0;
		
		int ar [] = new int[5];
		
		try// You can have multiple try catch  block inside a class
		{
			if (a/b==1)
			{
				System.out.println("Number divisable by zero");
			}
			else
			{
				System.out.println("Number not divisable by zero");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught & handled successfully");
		}
		
		
		
		Thread.sleep(3000);//throws -- When you add Thread it will create throws exceptions in main method
		
		
		// You can have multiple try & catch block
		
		try 
		{
			ar [7] = 20;
			
			{
				System.out.println(" assign value can't be allocated due to out of bound index");
			}
			
		}	
		catch(Exception e)
		{
			System.out.println("2nd exception is caught and handled");
		}

	
		finally// Finally block will always gets printed regardless of code is pass or fail/ it will come last
		
		{
			System.out.println("Coding is completed and close the program");
		}
	

	}
	

}
