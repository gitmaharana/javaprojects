
public class thiskeyword_demo {
	
	int empl_no;
	String empn;
	long mobilen;
	
	//public void empl_details(int empl_no1,String empn1,long mobilen1)
	// if local variables arguments name is same instance/class variable then this keyword wont be required
	
	public void empl_details(int empl_no,String empn,long mobilen)
	
	// This keyword refers to current class instance variable.
	// when parameters & instance variables name same then method wont be able to distinguish local & instance variable
	//to resolve the ambiguity between instance variables and parameter this keyword is used
	
	{
		this.empl_no = empl_no;
		this.empn = empn;
		this.mobilen = mobilen;
			
	}
	
	public void display()
	{
			
		System.out.println("Empl id is :" + empl_no);
		System.out.println("Empl name is :" + empn);
		System.out.println("Empl mobile number is :" + mobilen);
	}

	public static void main(String[] args) {
			
		thiskeyword_demo td = new thiskeyword_demo(); 
		td.empl_details(555,"Nacky",88980980l);
		td.display();	
		

	}

}
