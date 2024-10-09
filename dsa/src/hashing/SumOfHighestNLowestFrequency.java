package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SumOfHighestNLowestFrequency {
	
	public static void main(String[] args) {
		//Input: arr = [1, 2, 2, 3, 3, 3], Output: 4
		//Input: arr = [4, 4, 5, 5, 6], Output: 3
		//Input: arr = [10, 9, 7, 7, 8, 8, 8], Output: 4
		int[] arr1 = {1, 2, 2, 3, 3, 3};
		int[] arr2 = {4, 4, 5, 5, 6};
		int[] arr3 = {10, 9, 7, 7, 8, 8, 8};
		System.out.println(sumHighestAndLowestFrequency(arr3));
	}
	
	
	//TC:O(n)
	//SC: O(k), where k is total no of unique elements in array (as we have stored them in a map as the key)
	//Note that: SC cant be O(1) coz no of unique elements present in array can easily vary based on input
    public static int sumHighestAndLowestFrequency(int[] nums) {
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i=0; i<nums.length; i++) {
    		int count;
    		if(map.containsKey(nums[i])) {
    			int value = map.get(nums[i]); //TC:O(1)
    			count=value+1;
    		} else {
    			count=1;
    		}
    		map.put(nums[i], count);
    	}
    	
		int lowestFrequency=Integer.MAX_VALUE;
		int highestFrequency=Integer.MIN_VALUE;
		
    	for(Entry<Integer,Integer> entry : map.entrySet()) {
    		int value = entry.getValue();
    		
    		if(value>highestFrequency) {
    			highestFrequency=value;
    		}
    		if(value<lowestFrequency) {
    			lowestFrequency=value;
    		}
    	}
    	
    	return lowestFrequency+highestFrequency;
    }
}

