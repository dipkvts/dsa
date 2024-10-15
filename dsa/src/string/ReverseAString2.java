package string;

public class ReverseAString2 {

	public static void main(String[] args) {
		//Input: s = ["h","e","l","l","o"], Output: ["o","l","l","e","h"]
		//Input: s = ["H","a","n","n","a","h"], Output: ["h","a","n","n","a","H"]
		char[] input1 = {'h','e','l','l','o'};
		char[] input2 = {'H','a','n','n','a','h'};
		reverseString(input2);
		System.out.println(input2);
	}
	
	
	//TC: O(n/2)
	//SC: O(1)
	//Explanation: This is same as 2 pointer approach
    public static void reverseString(char[] s) {
        
    	//Mid of an array "s" is: (s.length-1)/2
    	for(int i=0; i<=(s.length-1)/2; i++) {
    		char temp = s[i];
    		s[i]=s[s.length-1-i];
    		s[s.length-1-i]=temp;
    	}
    	
    }
    

    //Stack can also be used (same complexity)
    public static void reverseString1(char[] s) {}
}
