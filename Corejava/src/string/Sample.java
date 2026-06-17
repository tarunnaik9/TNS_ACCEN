package string;

class Samp{
	public void show() throws Exception
	{
		int age=12;
		try {
			if(age<18)
			{
				throw new Exception("Not Eligible");
			}
		}finally {
			System.out.println("Hello");
		}
	}
}
public class Sample {

	public static void main(String[] args) throws Exception {
		Samp o = new Samp();
		o.show();

	}

}
