package string;

public class ReplaceCharWithOccurance {

	public static void main(String[] args) {
		
		//String input="OPENTEXT";
		//Replace 'T' with its occurance
		//String output="OPEN1EX2";
		
		
		String input="OPENTEXT";
		
		
		//WAY-1
		int counter =0;
		for(int i=0; i<input.length(); i++) {
			//No need to convert string into char[]
			if(input.charAt(i) == 'T') {
				counter+=1;
				//As string is immutable, so u need to reassign the modified  string
				input = input.replaceFirst(String.valueOf('T'), String.valueOf(counter));
			}
		}
		System.out.println(input);
		
		
		//WAY-2
		char[] arr = input.toCharArray();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='T') {
				//converts int into char
				arr[i] = (char)count++;
			}
		}
		System.out.println(new String(arr));
		
	}
	
}
