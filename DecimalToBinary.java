package recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.print(dec2Bin(676));
	}

	public static String dec2Bin(int value) {
		if (value == 1) {
			return "1";
		}
		return dec2Bin(value / 2) + value % 2;
	}

}
