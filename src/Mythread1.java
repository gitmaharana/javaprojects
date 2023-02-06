
public class Mythread1 implements Runnable {// step 1 - current class implements Runnable interface

	public void run()// Step 2 - non static run for creating a thread job
	{
		for (int i=1;i<=5;i++)//Step 3 - define thread job
		{
			System.out.println("This is my first Thread");
		}
		
	}
	
	// Multi threading using runnable inte rface
	public static void main(String[] args) {
		
		Mythread1 m1 = new Mythread1();
		//m1.start();CTE because there is no start() in Mythread class
		Thread m2 = new Thread(m1); // Object will be created for Thread class
		m2.start();//step 4
		
		for (int j=1;j<=5;j++)//Step 3 - define thread job
		{
			System.out.println("This is my Second Thread");
		}
		
		


	}

}