
public class thiskeyword2_demo {
	
	
	public void method1()
	
	{
		System.out.println("This is first method");
		
	}
	
	public void method2()
	
	{
		this.method1();//invoke current class method. If u don't add compiler will add automatically
		System.out.println("This is second method");
		
		
	}

	public static void main(String[] args) {
		
		thiskeyword2_demo td = new thiskeyword2_demo();
		td.method2();

	}

}
