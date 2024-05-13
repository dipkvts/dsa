
//*********
// ******* 
//  *****  
//   ***   
//    *    

//1st line contains [0space-9star-0space]
//2nd line contains [1space-7star-1space]
//3rd line contains [2space-5star-2space]
//4th line contains [3space-3star-3space]
//5th line contains [4space-1star-4space]
//Now establish relationship between i,j,rowSize,space etc.

package patterns;

public class TriangleInverted {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 0; i < row; i++) {
			//prints spaces
			for (int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			//prints *
			for (int j = 0; j<(row-i)*2-1; j++) {
				System.out.print("*");
			}
			//prints spaces
			for (int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}
