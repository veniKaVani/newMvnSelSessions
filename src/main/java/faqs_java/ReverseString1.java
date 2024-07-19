package faqs_java;

public class ReverseString1 {
    //how do you reverse a String??
	public static void main(String[] args) {
		
		//1. using string class - is immutable so reverse fn not available
		String str ="Aswagandha";
		int len = str.length();
		System.out.println(str.length());
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		//2. using String Buffer-which is immutable-revers() can be applied:
		StringBuffer sbuff = new StringBuffer(str);
		System.out.println(sbuff.reverse());

	}

}
