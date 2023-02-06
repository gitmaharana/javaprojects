
public class jvapoint_copyconstructors {
	
	String name;
	int age;
	
	jvapoint_copyconstructors(String name1,int age1)// parameterized constructor to initialize name & age
	{
		name =name1;
		age = age1;
	}
	//You need to create a constructor which will initiate an object
	
	jvapoint_copyconstructors(jvapoint_copyconstructors s)// object constructor s created with class name
	{
		name =s.name;
		age = s.age;
	}
	void display()
	{
		System.out.println("My name & age details are" + " " + name + " " + age);
	}

	public static void main(String[] args) {
		
		jvapoint_copyconstructors jc = new jvapoint_copyconstructors("Johny",33);
		jvapoint_copyconstructors jc1 = new jvapoint_copyconstructors(jc);//pass parameterized constructor object
		
		jc.display();
		jc1.display();
	}

}
