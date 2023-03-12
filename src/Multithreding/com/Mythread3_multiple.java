
package Multithreding.com;
public class Mythread3_multiple {

	public static void main(String[] args) {
	Mythread1 t=new Mythread1();
	Mythread11 t1=new Mythread11();
	Mythread12 t2=new Mythread12();
	t.start();
	t1.start();
	t2.start();
	for(int i=0;i<5;i++)
	{
	System.out.println("Poooja 1.0");
	}
	}}
	class Mythread1 extends Thread
	{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
	System.out.println("Poooja 2.0");
	}
	}}
	class Mythread11 extends Thread
	{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
	System.out.println("Poooja 3.0");
	}
	}}
	class Mythread12 extends Thread
	{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
	System.out.println("Poooja 4.0");
	}
	
	}

}
