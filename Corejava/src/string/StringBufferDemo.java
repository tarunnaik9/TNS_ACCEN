package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Welcome");
		System.out.println(s);
		System.out.println(s.append('!'));
		System.out.println(s);
		System.out.println(s.substring(3, 7));
		
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);
		System.out.println(sb.substring(2));
	}

}