package wrapperclass;

public class Wrapper {


	public static void main(String[] args) {
		
		//Auto Boxing
		int a = 10;
		System.out.println("The value of a is:"+a);
		Integer i = new Integer(a);
		System.out.println("The value of i is:"+i);
		
		//Auto Unboxing
		int unbox = i.intValue();
		System.out.println("The value of unbox is:"+unbox);

		char c = 'n';
		Character ch = new Character(c);
		System.out.println("The value of ch is:"+ch);
		
		char nchar = ch.charValue();
		System.out.println("The value of nchar is:"+nchar);
	}

}