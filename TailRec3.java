package recursion;

public class TailRec3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 2, 4, 6 };
		System.out.println(avarage(list, 3));
	}

	public static double avarage(int[] arr, int n) {
		return sum(arr, n, 0) / n;
	}

	public static double sum(int[] arr, int n, int result) {
		if (n == 0)
			return result;
		else
			return sum(arr, n - 1, result + arr[n - 1]);

	}

}
