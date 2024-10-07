package Math;

//int num1=4695; output:4
//int num2=0; output:1
//int num3=9; output:1
//int num4=4095; output:4
public class CountAllDigitsOfANumber {

	public static void main(String[] args) {
		int num=4095;
		int count = countDigit(num);
		
		System.out.println("Total digits in number is :: " + count);
	}
	
	
	//WAY-1
	//TC: log(n) ie log n to base 10
	public static int countDigit(int n) {
		int count=0;
		
		if (n==0) count =1;
		
		while(n > 0) {
			n = n/10;
			count++;
		}
		
		return count;
	}
	
	
	//WAY-2
	//TC: log(n) ie log n to base 10
	public static int countDigit1(int n) {
		
		if (n==0) return 1;
		
		return (int)(Math.log10(n)+1);
	}
	
}
