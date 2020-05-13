
//This program is an example on recursion
//Date 5/12/2020


package recursion;

public class Recursion_exe {

	public static void main(String[] args) {
		writeNums(5);
		System.out.println();
		writeNums(12);
		
		

	}

	public static void writeNums(int n) {
		if (n < 1)
			throw new IllegalArgumentException();

		if (n == 1) {
			System.out.print(1);
			return;
		}

		writeNums(n - 1);
		System.out.print(", " + n);
	}
}
