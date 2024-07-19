package faqs_java;

public class faq2FactorialOfNum4 {

	public static void main(String[] args) {
		//!5= 5x4x3x2x1
		//!4= 24
		//!0=1
		
		int num=4;
		getFact(num);
	}
	public static void getFact(int num) {
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}

}
