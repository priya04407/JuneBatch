package pkg1;



public class Constructor {
	
	public Constructor(int a,int b)
	{
	System.out.println("two parameterised constructor");
}
	
	public Constructor(int a, int b ,float c)
	{
	System.out.println("three  parameterised constructor");
	}
	public Constructor( )
	{
	System.out.println("default constructor");
	}
	
	public static void main(String[] args)
	{
	new Constructor();
	new Constructor(1,2);
	}

}
