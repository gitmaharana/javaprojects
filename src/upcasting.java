

//Converting sub class object type into super class object type is called as upcastingg.

public class upcasting {

	public void view()
	{
		System.out.println("Student details are :");
		System.out.println("Name:John P");
		System.out.println("MJCET");
		System.out.println("BTECH-Computer Science");
		System.out.println("Degree-58.3%\nINT-75%\nSSC-66%");
	}
}
class Admin extends upcasting
{
	public void edit()
	{
		System.out.println("Edit details of Student");
		System.out.println("Name:John P");
		System.out.println("MJCET");
		System.out.println("BTECH-Computer Science");
		System.out.println("Degree-60.9%\nINT-75%\nSSC-66%");
	}

	public static void main(String[] args) {
		//upcasted object
		//During up-casting only super class behaviour is visible, sub class behavior is hidden.
		
		upcasting u1 = new Admin(); // left side = compilation & right side = Execution
		u1.view();
		//u1.edit(); not applicable

	}

}
