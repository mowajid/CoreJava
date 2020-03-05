package StringLogicalCording;

//Program to remove all the white spaces from a string.

public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hi my anme is wajid";

		str = str.replaceAll("\\s+", "");

		System.out.println("remove white space :" + str);
	}

}
