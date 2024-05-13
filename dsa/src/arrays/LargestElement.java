package arrays;

import java.util.Arrays;

public class LargestElement {
	
// BRUTEFORCE: O(n logn)
// Soln: sort the array, get the last element 
	
//	public static void main(String[] args) {
//		int[] arr = {7,3,8,3,0,7,4};
//		
//		Arrays.sort(arr);
//		System.out.println("Largest element is :: " + arr[arr.length-1]);
//	}

	
	
	//OPTIMAL: O(n)
	//Store temp largest in a variable. Compare every elements with this largest, if found bigger then replace largest with that element. Last left in largest is the largest
	public static void main(String[] args) {
		int[] arr = {7,3,8,3,21,7,4};
		
		int largest = Integer.MIN_VALUE;
		
		for(int element : arr) {
			if(element > largest) {
				largest = element;
			}
		}
		
		System.out.println("Largest element is :: " + largest);
	}
}
