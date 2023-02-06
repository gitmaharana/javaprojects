
public class Mythread extends Thread  {//step 1

	// Multi threading can be done by 2 processes - by extending Thread class or implementing runnable Interface

	public void run()//step 2 - For defining thread we have to override run()
	{
		for (int a =1;a<=5;a++)//Step 3 - Define the job  the thread
		{
			System.out.println("This  is my first thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {// Main method is the default Thread in any program

		Mythread m1 = new Mythread();

		m1.start();//Step 4 - making my thread ready for execution by calling run();
		Thread.sleep(5000); // declare throws exception
		try {
			
		for (int b=1;b<=5;b++)//main method thread body is defined.
		{
			System.out.println("This  is my second thread");
		}}
		catch (Exception e)
		{
			System.out.println("Exception is caught and handles");
		}
		
		finally
		{
			System.out.println("End of program & close off....");
		}
		
	
		
	}

}
