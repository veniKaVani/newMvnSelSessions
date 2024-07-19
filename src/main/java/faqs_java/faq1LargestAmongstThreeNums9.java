package faqs_java;

public class faq1LargestAmongstThreeNums9 {

	public static void main(String[] args) {
		
		int x = 700;
		int y = 900;
		int z = 900;
		
		if(x>y && x>z) {
			System.out.println("x is the greatest");
		}else if(y>z) {
			System.out.println("y is the greatest");
		}else {
			System.out.println("z is the greatest");
		}
		
		System.out.println("----------------------");
		
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is the greatest");
			}else {
				System.out.println("z is the greatest");
			}
		}
		else {
			if(y>=z) {
				System.out.println("y is the greatest");
			}else {
				System.out.println("z is the greatest");
			}
		}

	}

}
