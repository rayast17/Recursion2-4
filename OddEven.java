package recursion;

public class OddEven {

	public static void main(String[] args) {

		System.out.println(IsEven(17));

	}

	public static boolean IsOdd(int n) {

		if (n == 0) {
			return false;
			
		} else if (n == 1) {
			return true;
			
		} else {
			return IsOdd(n - 2);
		}
	}

	public static boolean IsEven(int n) {

		if (n == 0) {
			return true;
			
		} else if (n == 1) {
			return false;
			
		} else {
			return IsEven(n - 2);
		}
	}

}
