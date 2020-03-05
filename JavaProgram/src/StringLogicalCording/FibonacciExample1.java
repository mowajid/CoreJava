package StringLogicalCording;

public class FibonacciExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 = 1, n3, count = 10;

		for (int i = 0; i < count; i++) {

			n3 = n1 + n2;

			System.out.println(n3);

			n1 = n2;
			n2 = n3;
		}

	}

}
/*
echo "# CoreJava" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/mowajid/CoreJava.git
git push -u origin master

pwd
ls
*/