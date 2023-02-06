
public class methodnew {

	public static void main(String[] args) {

		String sclname = "Roy";//localvar
		String branch;
		//System.out.println(sclname);//CTE(Compile time error) bcoz intialisation of local is mandatory
     
		displayDetails();// writing method in Main method
	}
	public static void displayDetails()
	
	{
		String sclname="S.T.H.C.S";//localvar
		String sname="Pooja";//localvar
		int age=22;//lv
		long contact=9587459618l;//loca lvar
		String email="poojamine@gmail.com";//localvar
		System.out.println(sname+" "+age+" "+contact+" "+email);
		System.out.println(sclname);//wont be able to call since branch is not local variable
		//System.out.println(branch);//wont be able to call since branch is not local variable
	}

}
