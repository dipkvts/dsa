package string;

import java.util.LinkedHashSet;
import java.util.Set;

//1.using java 8
//2.using indexOf(charAt())
//3.using character array
//4.using set interface method
public class RemoveDuplicateChars {

	public static void main(String[] args) {
		
		String str = "programming";
		
		//WAY-1: using java 8
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char)c));
		System.out.println("After removing duplicates1 :: " + sb);
		
		
		//WAY-2: using string's indexOf() and charAt() methods
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch, i+1)==-1) {
				sb2.append(ch);
			}
		}
		System.out.println("After removing duplicates2 :: " + sb2);
		//No need to convert Builder into String, just print
		
		
		//WAY-3: using toCharArray()
		StringBuilder sb3 = new StringBuilder();
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			boolean isDuplicate = false;
			for(int j=i+1; j<charArr.length; j++) {
				if(charArr[i]==charArr[j]) {
					isDuplicate = true;
					break;
				}//last duplicate element will still get picked by this logic, while eliminating duplicates found at other indexes for the same element
			}
			if(!isDuplicate)
				sb3.append(charArr[i]);
		}
		System.out.println("After removing duplicates3 :: " + sb3);
		
		
		//WAY-4: using set
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>(); //maintains insertion order
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(Character c : set) {
			sb4.append(c);
		}
		System.out.println("After removing duplicates4 :: " + sb4);
	}
	
}
