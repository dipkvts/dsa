package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecMostFrequentOccuringElementInArray {

	public static void main(String[] args) {
		//Input: arr = [1, 2, 2, 3, 3, 3], output: 2
		//Input: arr = [4, 4, 5, 5, 6, 7], Output: 6 
		//Input: arr = [10, 9 ,7, 7], Output: 9
		//Constraints: 1<= n <=10^4, 1<= arr[i] <=10^4
		int[] arr1 = {1, 2, 2, 3, 3, 3};
		int[] arr2 = {4, 4, 5, 5, 6, 7};
		int[] arr3 = {10, 9 ,7, 7};
		System.out.println(secondMostFrequentElement(arr3));
	}
	
	
	//TC: O(n)
    public static int secondMostFrequentElement(int[] nums) {
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
    	
    	int maxFrequency=0;
    	int maxFrequencyButLeastInValue=0;
    	int secMaxFrequency=-1;
    	int secMaxFrequencyButLeastInValue=-1;
    	
    	for(Entry<Integer,Integer> entry : map.entrySet()) {
    		int key = entry.getKey();
    		int value = entry.getValue();
    		if(value>maxFrequency) {
    			secMaxFrequency = maxFrequency;
                secMaxFrequencyButLeastInValue = maxFrequencyButLeastInValue;
    			maxFrequency=value;
    			maxFrequencyButLeastInValue=key;
    		} else if(value==maxFrequency) {
    			if(maxFrequencyButLeastInValue>key) {
    				maxFrequencyButLeastInValue=key;
    			}
    		} else if(value>secMaxFrequency) {
    			secMaxFrequency=value;
    			secMaxFrequencyButLeastInValue=key;
    		} else if(value==secMaxFrequency) {
    			if(secMaxFrequencyButLeastInValue>key) {
    				secMaxFrequencyButLeastInValue=key;
    			}
    		}
    	}
    	
    	if(secMaxFrequency==-1)
    		secMaxFrequencyButLeastInValue=-1;
    		
    	return secMaxFrequencyButLeastInValue;
    }
    
}
