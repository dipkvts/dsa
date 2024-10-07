package Math;

public class LargestDigitOfANumber {

	public static void main(String[] args) {
		int num = 25; //99 //1 //0
		largestDigit(num);
	}

	public static int largestDigit(int n) {

		if (n==0) return 0;
		
		int largestNum = Integer.MIN_VALUE;
		while (n > 0) {
			int digit = n % 10;
			if (digit > largestNum)
				largestNum = digit;
			n = n / 10;
		}

		return largestNum;
	}

}
