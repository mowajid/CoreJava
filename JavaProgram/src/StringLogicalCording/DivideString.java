package StringLogicalCording;

//Java Program to divide a string in 'N' equal parts.

public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaaabbbbcccc";

		int len = str.length();
		int n = 3;

		int temp = 0, chars = len / n;

		String arr[] = new String[n];

		if (len % n != 0) {
			System.out.println("String no devide in equlase part :" + n);
		}

		for (int i = 0; i < str.length(); i = i + chars) {

			String part = str.substring(i, i + chars);

			arr[temp] = part;

			temp++;
		}

		System.out.println(n + ":String is devide in equlse part");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}
}