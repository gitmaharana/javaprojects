import java.util.Scanner;

public class Arrray_demo3 {

	public static void main(String[] args) {

		int a[] = new int[4];

		a[0] = 33;
		a[1] = 33;
		a[2] = 33;
		a[3] = 33;
		System.out.println(a[3]);
		System.out.println(a.length);

		String d[] = {"ram","shym","hari"};

		for(int i=0;d.length>i;i++)
		{
			System.out.println(d[i]);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ARRAY SIZE");
		int size = sc.nextInt();
		String st[] = new String[size];


		for(int k=0;st.length>k;k++)
		{
			System.out.println("Please enter NAME");
			st[k] = sc.next();
		}
		
		System.out.println("PRINT THE ELEMENTS IN REVERSE ORDER");
		for(int j=st.length-1;j>=0;j--)
		{
			
			System.out.println(st[j]);
		}







	}

}
