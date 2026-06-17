package polym;

public class MethodOverload {
	public void show()
	{
		System.out.println("This is show method with 0 paramenters");
	}
	public void show(int a)
	{
		System.out.println("This is show method with 1 paramenters"+a);
	}
	public void show(int a,float b)
	{
		System.out.println("This is show method with 2 paramenters"+a+ "and" +b);
	}
	public void show(float a,int b)
	{
		System.out.println("This is show method with 3 paramenters"+a+ "and" +b);
	}
}