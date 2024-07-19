package faqs_java;

public class faq2Positive_NegativeNum1 {

	public static void main(String[] args) {
		/*
		 * 0 is non-negative, non-positive no
		 * so it says 0.0 is zero
		 * with double data type can handle both positive scenario and negative scenario
		 */
		
		
		double num = 0;
		
		if(num < 0.0) {
			System.out.println(num+" is a negative number");
		}
		else if(num > 0.0) {
			System.out.println(num+" is positive number");
		}else {
			System.out.println(num+" is zero");
		}

	}

}
