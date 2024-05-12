
//1
//01
//101
//0101
//10101

package patterns;

public class RightAngleTriangle01 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			int startVal = 0;
			//starting from 0th index, if row no is even start value would be 1, else 0
			if (i % 2 == 0) startVal = 1;
			for (int j = 0; j <= i; j++) {
				//from 2nd element onwards, flip values 
				if (j > 0) startVal = 1 - startVal;
				System.out.print(startVal);
			}
			System.out.println();
		}
	}

}
