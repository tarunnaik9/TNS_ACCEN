package features;
@FunctionalInterface
interface Demo{
	void Hello();  //Functional Interface
	//void Display();
}
//Lambda Exp without parameters
public class LambdaFeature {
	public static void main(String[] args) {
		Demo d = ()->{
			System.out.println("Helloo!!!");
			System.out.println("Welcome to Java!!!");
		};
		d.Hello();
	}
}
