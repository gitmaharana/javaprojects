
public class Jvapont_defaultconstructor {
	
	//Constructor is used to  initialize non static variable &  it does not have any return type
	//constructor has same name type as class
	//constructor can't be static,final.abstract and inherited
	//constructor can be public,private,default,protected
	

	String name;
	int rollno;
	int age;
	
	Jvapont_defaultconstructor(String name1,int rollno1)// 2 argument parameterized constructor
	
	{
		name = name1;
		rollno = rollno1;
	}
	
	//This is constructor overloading
	Jvapont_defaultconstructor(String name1,int rollno1,int age1)// 3 argument parameterized constructor
	
	{
		name = name1;
		rollno = rollno1;
		age = age1;
	}
	public void display()
	{
		System.out.println("This is  my name" + " "+ name + ", roll no. is" +" "+ rollno + " age is" +" "+ age);
	
	}
	
	public static void main(String[] args) {
		
		Jvapont_defaultconstructor jd = new Jvapont_defaultconstructor("rocky",33);
		Jvapont_defaultconstructor jd1 = new Jvapont_defaultconstructor("rocky",33,11);
		
		jd.display();
		jd1.display();

	}

}
