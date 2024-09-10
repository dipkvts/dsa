package string;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "Hello World";
		
		//WAY-1
		char[] chArr = str.toCharArray();
		for(int i=chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]);
		}
		System.out.println();

		
		//WAY-2
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		
		//WAY-3
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
		
		
		//WAY-4
		StringBuilder sbldr = new StringBuilder(str);
		sbldr.reverse();
		System.out.println(sbldr.toString());
	}

}
