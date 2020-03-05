package StringLogicalCording;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseStringEx5 {

	public static void main(String[] args) {

		String str = "wajid";

		char[] arr = str.toCharArray();

		ArrayList<Character> list = new ArrayList<>();

		for (char c : arr)
			list.add(c);

		Collections.reverse(list);

		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
