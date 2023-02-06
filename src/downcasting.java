//Converting a super class object type into sub class object type is called as downcasting.
public class downcasting {
	
	public void view()
	{
		System.out.println("Student details are :");
		System.out.println("Name:John P");
		System.out.println("MJCET");
		System.out.println("BTECH-Computer Science");
		System.out.println("Degree-58.3%\nINT-75%\nSSC-66%");
	}
}
class Admin1 extends downcasting
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
		downcasting u1 = new Admin1(); // left side = compilation & right side = Execution
		u1.view();
		System.out.println("**********************************************");
		//u1.edit(); not applicable
		
		//downcasted object
		Admin1 a1 = (Admin1) u1;
		//During downcasting only super class/sub class behaviour is visible
		a1.view();
		a1.edit();
				


	}

}
