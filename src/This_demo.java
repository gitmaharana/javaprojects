
public class This_demo {
	
	String emp_name,school;
	int age,roll_no;
	
	public void student_info(String emp_name1,String school1,int age1,int roll_no1)
	{
		this.emp_name = emp_name1;
		this.school = school1;
		this.age = age1;
		this.roll_no = roll_no1;	
	}
	
	public void info_display()
	{
		System.out.println("Employee name :" +emp_name);
		System.out.println("School name :" +school);
		System.out.println("Your age :" +age);
		System.out.println("Your roll_no :" +roll_no);
		System.out.println("**********************************************************");
	}
	public static void main(String[] args) {
	
		This_demo t1 = new This_demo();
		t1.student_info("rohit","new school",44,34435);
		t1.info_display();
		t1.student_info("John","old school",33,34441);
		t1.info_display();
	}

}
