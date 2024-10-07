package Math;

//int num=4695; output: 5964
//int num2=0; output:0
//int num3=9; output:9
//int num4=4095; output:5904

//Approach: Keep taking out last digit of the number untill all digits are traversed. Multiply this digit by 10 and add to it the next extracted number
public class ReverseANumber {
	
	public static void main(String[] args) {
		int num=5904;
		int reversedNum = countDigit(num);
		
		System.out.println("Number is :: " + num);
		System.out.println("Reversed no is :: " + reversedNum);
	}
	
    public static int countDigit(int n) {
		int tempNum=n;
		
		int count=0;
		int reversedNum=0;
		
		if(n==0) reversedNum=0;
		
		while(tempNum>0) {
			int lastDigit = tempNum%10;
			tempNum=tempNum/10;
			count = count+1;
			
			if(count==1)
				reversedNum = lastDigit;
			else if(count>1)
				reversedNum = (reversedNum*10)+lastDigit;
			
		}
		
		return reversedNum;
    }
	
}
