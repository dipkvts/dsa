package Math;

public class CheckIfArmstrongNumber {
	public static void main(String[] args) {
		int num = 153; //370 //153 //0
		System.out.println("11111111111");
		System.out.println("Is number a armstrong number ? " + isArmstrong(num));
	}

	public static boolean isArmstrong(int n) {

		if(n==0) return true;
		
		int finalNum=0;

		int numCopy1 =n;
		int totalDigits = 0;
		while (numCopy1 > 0) {
			numCopy1 = numCopy1 / 10;
			totalDigits++;
		}

		int numCopy2 =n;
		while(numCopy2 > 0) {
			int selfMultipliedVal=1;
			int lastDigit = numCopy2%10;
			for(int i=1; i<=totalDigits; i++) {
				selfMultipliedVal = selfMultipliedVal*lastDigit;
			}
			finalNum = finalNum+selfMultipliedVal;
			numCopy2 = numCopy2/10;
		}
		
		return n==finalNum;
	}
}
