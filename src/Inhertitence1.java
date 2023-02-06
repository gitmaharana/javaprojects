
public class Inhertitence1 {
	
	String accname="John";
	int accno=245678;
	double avalbal=100;
	public void details()
	{
	System.out.println("Account Holder : "+accname+" accno:"+accno);
	}}
	class Deposit extends Inhertitence1
	{
	double amt=4550.5;
	public void depositamt()
	{
	avalbal=avalbal+amt;
	System.out.println("Total balance after depositing Amt :"+avalbal);
	}

	public static void main(String[] args) {
		Deposit d1=new Deposit();
		d1.details();
		d1.depositamt();

	}

}
