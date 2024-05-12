
//    *    
//   ***   
//  *****  
// ******* 
//*********

//3 inner for loops inside an outer for loop. 3 Inner for loops are for [space-star-space].
//1st line contains [4space-1star-4space]
//2nd line contains [3space-3star-3space]
//3nd line contains [2space-5star-2space]
//4nd line contains [1space-7star-1space]
//5th line contains [0space-9star-0space]
//Now establish relationship between i,j,rowSize,space etc.

package patterns;

public class Triangle {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 0; i < row; i++) {
			//prints spaces
			for (int j = 0; j<row-1-i; j++) {
				System.out.print(" ");
			}
			//prints *
			for (int j = 0; j<i*2+1; j++) {
				System.out.print("*");
			}
			//prints spaces
			for (int j = 0; j<row-1-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
