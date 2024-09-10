package string;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//String input = "AABCDCBDEFD";
//String output = 'E';

public class FirstNonRepetingCharacter {

	public static void main(String[] args) {
		
		String input = "AABCDCBDEFD";
		
		
		//WAY-1: Keep frequency in a map maintaining insertion order, get key whose value=1
		//Explanation: Group string into map with character frequency. Insert characters into map by maintaining insertion order (LinkedHashMap). Get 1st character which has frequency as 1
		List<Character> charList = input.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		Map<Character, Long> charFrequency = charList.stream().collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()));
		Character ch = charFrequency.entrySet().stream().filter(entry -> entry.getValue()==1).findFirst().get().getKey();
		System.out.println("1st non repeting character1 :: "+ ch);

		
		//WAY-2: using map
		char output2 = ' ';
		Map<Character, Integer> map = new LinkedHashMap<>();//maintains insertion order
		for(int i=0; i<input.length(); i++) {
			char element = input.charAt(i);
			if(map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			} else {
				map.put(element, 1);
			}
		}
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				output2=entry.getKey();
				break;
			}
		}
		System.out.println("1st non repeting character2 :: "+ output2);
		
		
		//WAY-3: using simple for loop, without collection
		char output = ' ';
		for(int i=0; i<input.length(); i++) {
			boolean repeted=false;
			for(int j=0; j<input.length(); j++) {
				if((i!=j) && (input.charAt(i)==input.charAt(j))) {
					repeted = true;
					break;
				}
			}
			if(!repeted) {
				output = input.charAt(i);
				break;
			}
		}
		System.out.println("1st non repeting character3 :: "+ output);
	}
	
}
