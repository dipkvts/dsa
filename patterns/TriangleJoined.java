
//1      1
//12    21
//123  321
//12344321

//3 inner for loops inside an outer for loop. 3 Inner for loops are for [number-space-number]
//1st line contains [1number-6spaces-1number]
//2nd line contains [2number-4spaces-2number]
//3nd line contains [3number-2spaces-3number]
//4nd line contains [4number-0spaces-4number]

package patterns;

public class TriangleJoined {

	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {
			//prints numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			//prints spaces
			for (int j = 1; j <= (2 * n) - 2 - (2 * (i-1)); j++) {
				System.out.print(" ");
			}
			//prints numbers
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
