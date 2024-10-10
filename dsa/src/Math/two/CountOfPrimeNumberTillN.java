package Math.two;

public class CountOfPrimeNumberTillN {

	public static void main(String[] args) {
		int num = 30; // 6,10,20
		// if input:10, output: 4 (2,3,5,7) ie excluding 1 and the number n
		System.out.println("Total prime no to be counted upto number :: " + num);
		System.out.println("Total prime count upto above number :: " + primeUptoN(num));
	}

	
	//TC: n*sqrt(n)or n^(3/2)
	//j*j <= i is same as j <= Math.sqrt(n)
	public static int primeUptoN(int n) {

		if (n == 2)
			return 0;
		else if (n == 3)
			return 1;
		else if (n == 4)
			return 2;
		else if (n == 5)
			return 2;
		else if(n==6)
			return 3;

		int totalPrimeUptoN = 3;

		for (int i = 7; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j*j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				totalPrimeUptoN++;
		}

		return totalPrimeUptoN;
	}

}
