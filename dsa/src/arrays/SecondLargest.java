package arrays;

import java.util.Arrays;

//Same way SecondSmallest also u can find. Only in place of greater than, lesser than operator will come
public class SecondLargest {

	//BRUTEFORCE: O(n log n) + O(n)
	//Solution: Check if last and 2nd last elements are same. If yes, then from 2nd last element traverse in backward direction until u find 2nd largest
	public static void main1(String[] args) {
		
		int[] arr = { 8, 2, 9, 6, 2,9, 9, 8 };
		int size = arr.length;
		int secondLargest = 0;

		Arrays.sort(arr);
		
		if (arr[size-2] == arr[size-1]) {
			for (int i=size-2; i>=0; i--) {
				if (arr[i-1] < arr[i]) {
					secondLargest = arr[i-1];
					break;
				}
			}
		} else {
			secondLargest = arr[size-2];
		}
		
		System.out.println("Second largest element is :: " + secondLargest);
	}
	
	
	//BETTER: O(n)+O(n)
	//Solution: Calculate largest, pass this value (ie ignore it), again find largest excluding previous largest value
	public static void main2(String[] args) {
		
		int[] arr = { 8, 2, 9, 6, 2,9, 9, 8 };
		int size = arr.length;
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<size; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		for(int i=0; i<size; i++) {
			if(arr[i]>secLargest && (arr[i] !=largest)) {
				secLargest=arr[i];
			}
		}
		
		System.out.println("Second largest element is :: " + secLargest);
	}
	
	
	//OPTIMAL: O(n)
	//Solution: Take 2 variables largest n 2nd largest. Keep iterating n comparing. If element is bigger than largest, then swap them. If element is lesser than largest, then compare with second largest. If element bigger than 2nd largest, then store that element in 2nd largest
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 6, 2,9,7, 9, 8 };
		int size = arr.length;
		int largest = arr[0];
		int secLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<size; i++) {
			if(arr[i]>largest) {
				int temp=largest;
				largest = arr[i];
				secLargest=temp;
			} else if(arr[i]<largest && arr[i]>secLargest) {
				secLargest=arr[i];
			}
		}
		
		System.out.println("Second largest element is :: " + secLargest);
		
	}

}
