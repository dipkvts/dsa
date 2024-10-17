package string.two;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		//Input: str = ["flowers" , "flow" , "fly", "flight"], Output : "fl"
		//Input: str = ["lady" , "lazy"], Output: "la"
		//Constraints: 1 <= str.length <= 200, 1 <= str[i].length <= 200, str[i] contains only lowercase English letters.
		
		String[] strArr1= {"flowers" , "flow" , "fly", "flight"};
		String[] strArr2= {"lady" , "lazy"};
		String[] strArr3= {"dog" , "cat" , "animal", "monkey"};
		
		System.out.println(longestCommonPrefix2(strArr3));
	}
	
	
	//BRUTEFORCE
	//TC: O(m*n) m is minimun lenth of string available in array
	//TC: O(1)
	//Approach: compare 1st string characters one by one with each of the rest strings characters in array
    public static String longestCommonPrefix(String[] str) {

    	String commonPrefix="";
    	int minStrLength=201;
    	String firstString = str[0];
    	
    	//minLength is determined as sirf min string length count tak hi string traverse hona chahiye, else arrayOutOfBound exception may arise
    	for(String string : str) {
    		if(string.length()<minStrLength) {
    			minStrLength=string.length();
    		}
    	}

    	for(int i=0; i<minStrLength; i++) {
    		for(int j=1; j<str.length; j++) {
    			if(str[j].length()!=0 && firstString.charAt(i)!=str[j].charAt(i)) {
    				//As we dont want to check further, if further characters are not matching, thats why have returned from here itself
    				return commonPrefix;
    			}
    		}
    		commonPrefix+=firstString.charAt(i);
    	}
    	
    	return commonPrefix;
    }
    
    
    
    //TC: O((n log n)+m) as sorting has nlogn complexity
    //SC: O(1)
    //Approach: sort the array n compare 1st n last string characters
    public static String longestCommonPrefix2(String[] str) {
    
    	String commonPrefix="";
    	Arrays.sort(str);
    	
    	if(str[0].isEmpty() || str[str.length-1].isEmpty())
    		return commonPrefix;
    	
    	int minLength = Math.min(str[0].length(), str[str.length-1].length());
    	
    	for(int i=0; i<minLength; i++) {
    		if(str[0].charAt(i)!=str[str.length-1].charAt(i)) {
    			return commonPrefix;
    		}
    		commonPrefix+=str[0].charAt(i);
    	}

    	return commonPrefix;
    }
}