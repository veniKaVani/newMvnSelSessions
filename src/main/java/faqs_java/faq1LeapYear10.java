package faqs_java;

public class faq1LeapYear10 {

	public static void main(String[] args) {
		/*
		 * LeapNo: a no divisible by 4 for all century years ending with 00
		 * century year: is a leap year only when it is perfectly divisible is 400
		 * 1900 is not a leap year since not divisible by 400
		 * 2012 is a leap year
		 */
		
		int year=2020;
		boolean leap = false;
		
		if(year % 4==0) {
			if(year % 100==0) {
				if(year % 400==0) {
					leap = true;
				}
				else {
					leap = false;
				}
			}
			else {
				leap = true;
			}
		}
		else {
			leap = false;
		}
		
		if(leap) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}

	}

}
