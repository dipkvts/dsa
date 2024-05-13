package arrays;

public class CheckIfSorted {

	//OPTIMAL: O(n)
	public static void main(String[] args) {
		//int[] arr = { 2, 5, 9, 6, 2,9,7, 9, 8 };
		int[] arr = { 4, 5, 7, 8, 8,8,9, 9, 11 };
		boolean isSorted = true;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]<=arr[i+1]) {
			}
			else {
				isSorted=false;
			}
		}
		System.out.println("Sorted array :: " + isSorted);
	}
	
}
