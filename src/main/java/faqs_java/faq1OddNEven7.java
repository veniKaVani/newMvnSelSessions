package faqs_java;

import java.util.Scanner;

public class faq1OddNEven7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter a no:");
		
		int num = sc.nextInt();
		
		if(num % 2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}

	}

}
