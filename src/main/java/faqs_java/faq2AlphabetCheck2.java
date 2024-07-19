package faqs_java;

public class faq2AlphabetCheck2 {

	public static void main(String[] args) {
		
		char ch = '8';
		
		if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println(ch+" is an alphabet");
		else
			System.out.println(ch+" is not an alphabet");

	}

}
