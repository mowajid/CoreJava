package StringLogicalCording;

public class changeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Wajid Bhai";

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i))) {

				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));

			}

			if (Character.isUpperCase(str.charAt(i))) {

				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}

		System.out.println(sb);

	}

}
