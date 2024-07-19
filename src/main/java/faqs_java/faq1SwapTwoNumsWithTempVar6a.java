package faqs_java;

public class faq1SwapTwoNumsWithTempVar6a {

	public static void main(String[] args) {
		int a = 11;
		int b = 12;
		
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("after swapping:");
		
		int temp;
		temp = a;
		a=b;
		b = temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
