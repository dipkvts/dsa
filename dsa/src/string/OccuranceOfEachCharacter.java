package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		//String input= "hello";
		//Output: h:1, e:1, l:2, o:1
		
		String input= "hello";
		
		//WAY-1: java8
		char[] arr = input.toCharArray();
		List<Character> charList = new  ArrayList<>();
		for(Character charac : arr) {
			charList.add(charac);
		}
		Map<Character, Long> frequency = charList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("frequency-1 :: " + frequency);
		
		
		//WAY-2: normal for loop
		Map<Character, Integer> charMap = new HashMap<>();
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			} else 
				charMap.put(ch, 1);
		}
		System.out.println("frequency-2 :: " + charMap);
		
	}
	
}
