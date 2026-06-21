package features;

interface Addition {
    int add(int a, int b);
}
//Lambda Exp with parameters
public class WithPara {

	public static void main(String[] args) {
		Addition obj = (a, b) -> a + b;

        System.out.println(obj.add(10, 20));
	}

}