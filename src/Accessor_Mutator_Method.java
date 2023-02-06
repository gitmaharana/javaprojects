import java.util.Scanner;

public class Accessor_Mutator_Method {
	
	//Accessor_Method = This is called getter method. it accepts parameter and it returns value
	//Mutator_Method  = This is called setter method. it accepts parameter and no return type
	
	private int rollno;
	private String name;
	
	public void setRoll(int roll)// setter method
	
	{
		this.rollno = roll;
	}
	
	public int getRoll()// Getter method
	{
		return rollno;
	}
	
	public void setName(String name_info)// setter method
	{
		this.name = name_info;
	}
	
	public String getName()// Getter method
	
	{
		return name;
	}

	public void display()
	
	{
		System.out.println("My name is" + " "+name + " & My roll no is" + " "+ rollno);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your roll no.");
		int roll_no = sc.nextInt();
		
		System.out.println("Please enter your name.");
		String stu_name = sc.next();
		
		Accessor_Mutator_Method am = new Accessor_Mutator_Method();
		am.setName(stu_name);
		am.setRoll(roll_no);
		
		am.display();
		
	}

}
