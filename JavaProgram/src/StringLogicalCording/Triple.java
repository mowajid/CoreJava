package StringLogicalCording;

public class Triple {

	private boolean result = false;

	public boolean triple(int nums[]) {

		for (int i = 0; i < nums.length - 3; i++) {
			if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = { 1,2,4 };
		Triple o1 = new Triple();
		boolean reslt = o1.triple(a);
		System.out.println(reslt);
	}
}
