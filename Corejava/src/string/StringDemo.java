package string;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = new String("Hello");
		
		System.out.println(s.equals(s1)); //true
		System.out.println(s==s1);		  //false
		System.out.println(s.codePointAt(0));  //value
		System.out.println(s.length());
		
		System.out.println(s);
		System.out.println(s.toUpperCase()); //HELLO
		System.out.println(s);				 //Hello (immutable)
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(4));
		
	}

}
