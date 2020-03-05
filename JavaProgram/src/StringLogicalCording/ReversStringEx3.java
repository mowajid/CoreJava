package StringLogicalCording;


// by using tocharArray  char by char reverse string
public class ReversStringEx3 {

	public static void main(String[] args) {
		
		
		String str ="wajid";
		
		char[] arr = str.toCharArray();
		
		for (int i = arr.length-1; i>=0; i--) {
			
			System.out.println(arr[i]);
		}

	}

}
