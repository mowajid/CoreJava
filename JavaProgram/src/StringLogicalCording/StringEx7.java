package StringLogicalCording;

public class StringEx7 {

	public static void main(String[] args) {

		String str1 = new String("wajid");

		String str2 = new String(str1);

		String str3 = str1;

		System.out.println(str1.equals(str2)); // cheak value true  imp
		System.out.println(str1 == str2); // cheak address falue
		
		System.out.println(str1==str3);
		
		System.out.println(str1.equals(str3));

	}

}
