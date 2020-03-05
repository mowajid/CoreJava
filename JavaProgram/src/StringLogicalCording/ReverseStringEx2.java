package StringLogicalCording;
// reverse by using StringBuilder

public class ReverseStringEx2 {
	

	public static void main(String[] args) {
		
		String str = "wajid";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		sb=sb.reverse();
		System.out.println(sb);
		
		

	}

}
