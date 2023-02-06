
public class Overridding_demo {
	
	void animal()
	{
		System.out.println("dangerous");
	}
}

class Overridding_demo2 extends Overridding_demo{

void animal()
{
	System.out.println("easy to handle");
}
	public static void main(String[] args) {
	
		Overridding_demo2 od = new Overridding_demo2();
		
		od.animal();
		
	}

}
