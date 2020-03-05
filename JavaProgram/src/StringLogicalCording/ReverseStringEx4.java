package StringLogicalCording;

public class ReverseStringEx4 {

	public static void main(String[] args) {
		
		
		String str ="wajid";
		
		int leng = str.length();
		
		String rev = "";
		
		for(int i = leng-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		

	}

}
