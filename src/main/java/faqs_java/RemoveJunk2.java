package faqs_java;

public class RemoveJunk2 {
     //How to remove junk from a String?? script of other langs
	public static void main(String[] args) {
	
		String s = "@#$%^&  latin  !(^(%$# String 01234567890";
		
		//1. using Regular Expression:[^a-zA-Z0-9]
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
