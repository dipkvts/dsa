package string.two;

public class LargestOddNumberInAString {

	public static void main(String[] args) {
		//Input: s = "0214638", Output : "21463"
		//Explanation: The different odd numbers that can be formed by the given string are --> 1, 3, 21, 63, 463, 1463, 21463.We cannot include 021463 as the number contains leading zero. So largest odd number in given string is 21463.
		//Input : s = "0032579", Output: "32579"
		//Input: 5034, output: 503
		
		String str1="0214638";
		String str2="0032579";
		String str3="5347";
		String str4="05034";
		
    	System.out.println(largeOddNum(str2));
	}
	
	//TC:O(n)
	//SC: O(1)
	//Approach: Traverse from right n find out 1st odd digit, mark it as lastIndex. Find out 1st non-zero digit from left and mark it as firstIndex. Get substring from 1st till lastIndex 
    //Integer.parseInt(String.valueOf(s.charAt(j))) is same as "s.charAt(j)-'0'"
	public static String largeOddNum(String s) {
    	
    	int lastOddIndex=-1;
    	int firstNonZeroIndex=-2;
    	
    	for(int j=s.length()-1; j>=0; j--) {
    		if((s.charAt(j)-'0')%2 !=0) {
    			lastOddIndex=j;
    			break;
    		}
    	}
    	
    	if(lastOddIndex==-1) return "";
    	
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i)!='0') {
    			firstNonZeroIndex=i;
    			break;
    		}
    	}
    	
    	return s.substring(firstNonZeroIndex, lastOddIndex+1);
    }
}
