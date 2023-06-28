package pkg1;

public class Student {
	
	int rollNo;
	int age;
	public void method1()
	{
		System.out.println("Welcome to all of you");
	}
	public void method2()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) {
		Student abc = new Student();
		abc.method1();
		abc.method2();
		abc.rollNo = 123;
		abc.age=20;
		System.out.println(abc.age);
		System.out.println(abc.rollNo);
	}
	

}
