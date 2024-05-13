package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSorted {

	//BRUTEFORCE: O(n log n) + O(n)
	//Solution: use "set" DS. TC in set insertion is (n log n)
	public static void main1(String[] args) {
		int[] arr = { 2, 4, 4, 6, 7, 8, 8, 8, 10 };

		Set<Integer> set = new HashSet<>();
		for(int element: arr) {
			set.add(element);
		}
		
		int i=0;
		for(Integer element : set) {
			arr[i]=element;
			i++;
		}

		for(int x=set.size(); x<arr.length; x++) {
			arr[x]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	//OPTIMAL: O(n)
	//Solution: 2 pointers approach. Initialize one pointer on i=0 and keep traversing with j index until u find i n j indexed elements are not equal.
	//If unique element found then keep that next unique increment on i+1 index. Increment i index position by 1 and again move j index
	public static void main(String[] args) {
		
		int[] arr = { 2, 4, 4, 6, 7, 8, 8, 8, 10 };
		
		int i=0;
		for(int j=1; j<arr.length; j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		
		System.out.println("Total unique elements are :: " + (i+1));
	}

}
