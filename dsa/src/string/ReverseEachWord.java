package string;

public class ReverseEachWord {

	public static void main(String[] args) {
		//Requirement
		//String input = "java code";
		//String output = "avaj edoc";
		
		StringBuilder output = new StringBuilder();
		
		String input = "java code is great";
		String[] arr = input.split(" ");
		
		for(int x=0; x<arr.length; x++) {
			if ((x > 0) && (x != arr.length)) {
				output.append(" ");
			}
			for(int i=arr[x].length()-1; i>=0; i--) {
				output.append(arr[x].charAt(i));
			}
		}
		System.out.println("Original string :: " + input);
		System.out.println("Reversed each word :: " + output);
	}
	
}
