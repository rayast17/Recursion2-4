package recursion;

public class TailRec1 {
	public static void main(String[] args) {
		System.out.println("The sum is " + xMethod(7));
	}

	public static int xMethod(int n) {
		return xMethod(n, 1);
	}

	public static int xMethod(int n, int result) {
		
		if (n == 1) {
			return result;
			
		} else {
			return xMethod(n - 1, result + n);
		}
	}
}
