package pkg1;

public class Constructorcalling {
	public Constructorcalling()
	{
		this(44,56,76);
		System.out.println("Default method");
	}
	public Constructorcalling(int a)
	
	{
		this();
		System.out.println("one parameterised method");
	}
	public Constructorcalling(int a, int b)
	{
		this(12,13,14,15);
		System.out.println("two parameterized method");
	}
	public Constructorcalling(int a ,int b ,int c)
	{
		System.out.println("three parameterized method");
	}
	public Constructorcalling(int a,int b,int c,int d)
	{
		this(44);
		System.out.println("Four parameterized method");
	}
     public static void main(String[] args)
     {
    	 Constructorcalling obj1 = new Constructorcalling(22,23);
     }
}
