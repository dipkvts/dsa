package arrays;

public class SecondSmallest {

		//OPTIMAL: O(n)
		//Solution: Take 2 variables smallest n 2nd smallest. Keep iterating n comparing. If element is smaller than smallest, then swap them. If element is bigger than smallest, then compare with second smallest. If element smaller than 2nd smallest, then store that element in 2nd smallest
		public static void main(String[] args) {
			int[] arr = { 2, 5, 9, 6, 2,9,7, 9, 8 };
			int size = arr.length;
			int smallest = arr[0];
			int secSmallest = Integer.MAX_VALUE;
			
			for(int i=0; i<size; i++) {
				if(arr[i]<smallest) {
					int temp=smallest;
					smallest = arr[i];
					secSmallest=temp;
				} else if(arr[i]>smallest && arr[i]<secSmallest) {
					secSmallest=arr[i];
				}
			}
			
			System.out.println("Second largest element is :: " + secSmallest);
			
		}
	
}
