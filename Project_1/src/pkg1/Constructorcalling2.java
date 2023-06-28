package pkg1;

public class Constructorcalling2 {
	public void m1(int a)
	{
		System.out.println("one parameterized method");
	}
	public void m2(int a,int b)
	{
		
		System.out.println("two parameterized method");
	}
	public void m3(int a,int b,int c)
	{
		
		System.out.println("three parameterized method");
	}
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("four parameterized method");
	}
	public void m()
	{
		this.m3(22,33,44);
		System.out.println("default method");
		this.m1(11);
		this.m4(11, 22, 33, 44);
		this.m2(11, 22);
	}
	public static void main(String[] args)
	{
	Constructorcalling2 obj = new Constructorcalling2();
	obj.m();
	}
}
