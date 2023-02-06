
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int arm = 153;
		int rev =0;
		
		while(arm >0)
		{
			int rem =arm % 10;
			rev = rev + (rem*rem*rem);
			arm = arm/10;		
		}
		
			System.out.println("Reverse number is :" +rev);
	}

}
