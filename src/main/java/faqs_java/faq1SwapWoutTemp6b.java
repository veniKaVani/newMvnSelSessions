package faqs_java;

public class faq1SwapWoutTemp6b {

	public static void main(String[] args) {
		int a = 11;
		int b = 12;
		
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("after swapping:");
		
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
