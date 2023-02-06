
public class overload_method2 {
	
	public static void payment(String wallettype,int UID)
	{
	System.out.println("WalletType : "+wallettype);
	System.out.println("UID : "+UID);
	System.out.println("******************************************************************");
	}
	public static void payment(String cardtype,long cardno,int cvvnumber)
	{
	System.out.println("CardType : "+cardtype);
	System.out.println("CardNo : "+cardno);
	System.out.println("CvvNumber : "+cvvnumber);
	System.out.println("******************************************************************");
	}
	public static void payment(String type,String username,int pwd,long
	Accountnumber)
	{
	System.out.println("Type : "+type);
	System.out.println("Username : "+username);
	System.out.println("Pwd : "+pwd);
	System.out.println("AccountNumber : "+Accountnumber);
	System.out.println("******************************************************************");
	}

	public static void main(String[] args) {
	
		payment("Gpay",9573);
		payment("Debitcard",4581643278941254l,522);
		payment("savings","ravikiran",6547523,35486785214l);
		
	}

}
