package StringLogicalCording;

//Java Program to count the total number of characters in a string

public class CountTotalNoOfChartorInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "my name is wajid";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ')

				count++;

		}

		System.out.println("strinh count:" + count);

	}
}