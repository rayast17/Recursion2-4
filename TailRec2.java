package recursion;

public class TailRec2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powRecursive(4, 3));
	}

	public static int powRecursive(int x, int n) {
		return powRecursive(x, n, 1);
	}

	public static int powRecursive(int x, int n, int result) {
		
		if (n == 0) {
			return result;
		}

		return powRecursive(x, n - 1, result * x);
	}
}
