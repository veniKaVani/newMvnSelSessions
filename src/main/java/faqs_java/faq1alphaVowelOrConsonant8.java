package faqs_java;

public class faq1alphaVowelOrConsonant8 {

	public static void main(String[] args) {
		char ch = 'z';
		
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println(ch+" is a vowel");
		}else {
			System.out.println(ch+" is a consonant");
		}
		
		System.out.println("----using switch case statement----");
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is vowel");
			break;

		default:
			System.out.println(ch+" is a consonant");
			break;
		}

	}

}
