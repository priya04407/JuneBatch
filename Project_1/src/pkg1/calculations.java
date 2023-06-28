package pkg1;



public class calculations {
	public int sum(int a,int b) {
		int c;
		c= a+b;
		System.out.println("The sum result is :" +c);
		return c;
		
	}
	public int sub(int x,int y) {
		int z = x-y;
		System.out.println("The subtraction result is :" +z);
		return z;
	}
	public int div(int x1,int x2) {
		int z1 = x1/x2;
		System.out.println("The division result is :" +z1);
		return z1;
	}
	public int mul(int a1,int a2)
	{
		int a3 = a1*a2;
		System.out.println("The multiplication result is :" +a3);
		return a3;
	}
	public static void main(String[] args) {
		calculations obj = new calculations();
		
		int addsum1 = obj.sum(10,2);
		int addsum2 = obj.sum(addsum1,2);
		int subresult = obj.sub(addsum2,2);
		int mulvalue = obj.mul(subresult,2);
		//int  finalresult = obj.div(mulvalue,2);
	 obj.div(mulvalue,2);
	//	System.out.println("The Final Value is:"+ finalresult);
		
	}
}
