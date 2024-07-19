package faqs_java;

public class ReverseInteger3 {
	// How to reverse an integer?
	public static void main(String[] args) {
		// 1. using proper algorithm:
		long num = 12345; // rev = 54321
		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse num is ::" + rev);

		// 2.using String Buffer method:
		long num1 = 123456;

		System.out.println(String.valueOf(num1));

		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
	}

}
