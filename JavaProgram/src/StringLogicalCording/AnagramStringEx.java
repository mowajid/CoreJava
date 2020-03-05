package StringLogicalCording;

import java.util.Arrays;

public class AnagramStringEx {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "ajva";

		System.out.println("both string :" + anagramCheak(str1, str2));
	}

	public static boolean anagramCheak(String str1,String str2) {
		
		char [] arr1 = str1.toCharArray();
		char [] arr2= str2.toCharArray();
		
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	return Arrays.equals(arr1, arr2);
	}

}
