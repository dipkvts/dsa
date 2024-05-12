
//1
//22
//333
//4444
//55555

package patterns;

public class Number2 {

	public static void main(String[] args) {
		int noOfRowsAndColumns = 5;
		for(int i=1; i<=noOfRowsAndColumns; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
}
