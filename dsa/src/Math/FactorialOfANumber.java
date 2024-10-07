package Math;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int num=8;
		factorial(num);
	}
	
	
	//TC: O(n)
    public static int factorial(int n) {

    	if (n==0) return 1;
    	
    	int factorial = 1;
    	while(n>=1) {
    		factorial =factorial*n;
    		n=n-1;
    	}
    	
    	return factorial;
    }
	
}
