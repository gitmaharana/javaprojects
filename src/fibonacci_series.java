
public class fibonacci_series {

	public static void main(String[] args) {
	
		// each number is sum of 2 preceding number
		// 0 1 1 2 3 5 8 13 21 34
		
	
		int n1 = 0, n2 =1, sum =0; // create 3 variables
		
		System.out.print(n1+ " " +n2);
		
		for (int i=2;i<20;i++)
			
		{
			sum = n1+n2; 
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		
		
		

	}

}
