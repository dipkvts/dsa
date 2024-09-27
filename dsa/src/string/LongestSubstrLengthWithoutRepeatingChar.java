package string;

//Input: abbac
//Output: bac --> length is 3

//Input: abcabcbb
//Output: abc --> length is 3

//Video: 1.34.33
public class LongestSubstrLengthWithoutRepeatingChar {

	public static void main(String[] args) {
		String input = "abcabcbb";
		for(int i=0; i<input.length(); i++) {
			int startIndex = 0;
			String tempSubstr = input.substring(startIndex, i);
			for(int j=startIndex; j<tempSubstr.length(); j++) {
				if(input.charAt(i) == tempSubstr.charAt(j)) {
					startIndex = j;
				}
			}
		}
	}
	
}
