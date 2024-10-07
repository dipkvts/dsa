package Math.imp;

import java.util.Arrays;

public class DivisorOfANumber {

	public static void main(String[] args) {

		//input: 16, output: [1,2,4,8,16] ie in sorted manner
		int num = 21;
		int[] result = divisors1(num);

		System.out.println("Results are :: ");
		
		//Sorting not needed in case of bruteforce method
		Arrays.sort(result);
		for (int i : result) {
			System.out.println(i);
		}

	}

	
	//BRUTEFORCE
	//TC: O(n/2)
	public static int[] divisors(int n) {
		
		int[] tempResult = new int[n];
		int y=0;

		for (int i=1; i <= n / 2; i++) {
			if (n % i == 0) {
				tempResult[y] = i;
				y++;
			}
		}
		tempResult[y]=n;
		
		//copied array ignores 0 valuesand takes only filled in values
		return Arrays.copyOf(tempResult, y+1);
	}
	
	
	//OPTIMAL
	//TC: O(sqrt(N)) + O(K*Log(K))
	//O(K*Log(K)) is the time taken in sorting the list of divisors, K is the number of divisors of the number
	public static int[] divisors1(int n) {
		
		int[] tempResult = new int[n];
		int y=0;

		for (int i=1; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				tempResult[y] = i;
				y++;
				//if divisor is not duplicate (like in case of divisors of 16 ie 16/4)
				if(n/i != i) {
					tempResult[y]=n/i;
					y++;
				}
			}
		}

		//returns a copy with new size
		return Arrays.copyOf(tempResult, y);
	}
}
