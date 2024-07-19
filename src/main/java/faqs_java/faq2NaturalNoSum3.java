package faqs_java;

public class faq2NaturalNoSum3 {

	public static void main(String[] args) {
		
		int num = 100;
		int sum = 0;
		
		//1+2+3+.......+100 =>5050
		
		for(int i=1;i<=num;i++) {
			sum = sum +i;
		}
		System.out.println("sum is "+sum);
		
		System.out.println("------------");
		
		int k=1;
		int sum2=0;
		while(k<=num) {
			sum2 = sum2+k;
			k++;
		}
		
      System.out.println("sum is: "+sum);
	}

}
