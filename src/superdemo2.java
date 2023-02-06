
public class superdemo2 {
	
	String color = "White";
	
}

class superdemo3 extends superdemo2{
	
	String color = "Black";
	
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
// Super keyword  is used to refer the current class instance variable only
	public static void main(String[] args) {
		
		superdemo3 sd3 = new superdemo3();
		sd3.printcolor();

	}

}
