
   public class Single_Inheritence_Demo {
	
	String bank;
	long account;
	int amount;
	
     void acc_details(String bank,long account) 
	{
		System.out.println("I have an account" +" "+ account +"in"+ bank);
	}
     
}
	
	class Inheri_Demo extends Single_Inheritence_Demo
	
	{
	
		void acc_details(String bank,long account) 
		{
			System.out.println("I have an account" +" "+ account +"in"+ bank);
		}
	
		
	public static void main(String[] args)
	
	{
		
		Inheri_Demo h1 =new Inheri_Demo();
		
		h1.acc_details("DCH Bank", 2415151555l);
		
		
	}

}

