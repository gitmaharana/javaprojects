
public class method_overloading {
	
	String name;
	int age;
	int rollno;
	String gender;

	void display(String name,int age)
	{
		System.out.println("My name and age :" +name + " " +age);
	}		
	void display(String name,int age,int rollno)
	{
		System.out.println("My name and age and roll :" +name + " " +age+ " " +rollno);
	}	
	void display(String name,int age,int rollno,String gender)
	{
		System.out.println("My name and age and roll with gender :" +name + " " +age+ " " +rollno+ " " +gender);
	}	
	public static void main(String[] args) {

		method_overloading m3 = new method_overloading();
		m3.display("Jay",33);
		m3.display("Jay",33,10);
		m3.display("Jay",33,10,"Male");
	}

}
