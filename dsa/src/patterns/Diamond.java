
//    *    
//   ***   
//  *****  
// ******* 
//*********
//*********
// ******* 
//  *****  
//   ***   
//    *  

//Join code of triangle n invertedTriangle

package patterns;

public class Diamond {

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
