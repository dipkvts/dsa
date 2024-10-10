package hashing.two;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentOccuringElementInArray {

	//int arr1[] = {1, 2, 2, 3, 3, 3}; Output: 3
	//int arr2[] = {4, 4, 5, 5, 6}; Output: 4 (as least in most repeated value)
	//int arr2[] = {10, 9 ,7}; Output: 7 (as least in value)
	//Constraints: (1<= n <=10^5) and (1<= arr[i] <=10^4)
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 2, 3, 3, 3};
		int[] arr2 = {4, 4, 5, 5, 6};
		int[] arr3 = {10, 9 ,7};
	
		System.out.println(mostFrequentElement3(arr3));
	}
	
	
	//BRUTEFORCE
	//TC: O(n^2) //if array size is taken max ie 10^4, it will throw TLE. So bruteforce will fail in that case
	//SC: O(10^4)
	public static int mostFrequentElement(int[] nums) {
		
		int maxOccured=-1;
		int minElementMaxOccured=-1;
		int[] visitedHash = new int[(int)Math.pow(10, 4)+1]; //or simply new int[10001];
		
		for(int i=0; i<nums.length; i++) {
			int counter=0;
			if(visitedHash[nums[i]]!=1) {
				for(int j=0; j<nums.length; j++) {
					if(nums[i]==nums[j]) {
						counter++;
					}
				}
				if(counter>maxOccured) {
					maxOccured=counter;
					minElementMaxOccured=nums[i];
				} else if(counter==maxOccured) {
					if(minElementMaxOccured>nums[i]) {
						minElementMaxOccured=nums[i];
					}
				}
				visitedHash[nums[i]]=1;
			}
		}
		
		return minElementMaxOccured;
	}
	
	
	//OPTIMAL-1
	//TC: O(n) since need to traverse all the elements 
	//SC: O(maxValue) or simply O(1). Coz if array contains max allowed value ie 10^4, then hash array of (same size+1) would need to be created. And since 10^4 is still a constant, we can also write its SC as O(1)
	//Since as per the given constraints, max value in the array can be upto 10^4, so still there is scope to use array data structure (in hashing technique)
    public static int mostFrequentElement2(int[] nums) {
     
    	int maxValue=Integer.MIN_VALUE;
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i]>maxValue)
    			maxValue=nums[i];
    	}
    	
    	int hash[] = new int[maxValue+1];
    	//Instead of writing above logic to find max value, u can simply construct the hash array with constraint+1 size. TC will still remains the same
    	//int hash2[] = new int[10^4+1];
    	
    	int maxCounter=Integer.MIN_VALUE;
    	//Instead of initializing it with 0, its better to initialize it with an absurd number like -1
    	int maxOccuringElementButSmallestInValue = -1;
    	
    	for(int i=0; i<nums.length; i++) {
    		hash[nums[i]]=hash[nums[i]]+1;
    		if(hash[nums[i]]>maxCounter) {
    			maxCounter=hash[nums[i]];
    			maxOccuringElementButSmallestInValue=nums[i];
    		} else if(hash[nums[i]]==maxCounter) {
                if (nums[i] < maxOccuringElementButSmallestInValue) {
                    maxOccuringElementButSmallestInValue = nums[i];
                }
    		}
    	}
    	
    	return maxOccuringElementButSmallestInValue;
    }
    
    
    //OPTIMAL-2
    //TC: O(n)
    //SC: O(n) in worst case when all are unique elements
    public static int mostFrequentElement3(int[] nums) {
    	Map<Integer,Integer> map = new HashMap<>();
    	int maxOccuredCount =-1;
    	int maxOccuredMinElement=-1;
    	for(int i=0; i<nums.length; i++) {
    		int count;
    		if(map.containsKey(nums[i])) {
    			int value = map.get(nums[i]); //TC:O(1)
    			count=value+1;
    		} else {
    			count=1;
    		}
    		map.put(nums[i], count); //TC:O(1)
    		if(count>maxOccuredCount) { //comparing all the values to each other, n storing the max value come so far
    			maxOccuredCount=count;
    			maxOccuredMinElement=nums[i];
    		} else if(count==maxOccuredCount) {
    			if(maxOccuredMinElement>nums[i]) {
    				maxOccuredMinElement=nums[i];
    			}
    		}
    	}
    	return maxOccuredMinElement;
    }
	
}
