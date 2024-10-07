package Math;

public class CheckIfPrime {

	public static void main(String[] args) {
		int num=3; //5,8,9
		System.out.println(isPrime1(num));
	}
	
	
	//Bruteforce
	//TC: log(n)
    public static boolean isPrime(int n) {
    	
    	boolean isPrime=true;
    	
    	for(int i=2; i<=n/2; i++) {
    		if(n%i==0)
    			isPrime = false;
    	}
    	return isPrime;
    }
    
    
    //Optimal
    //TC: sqrt(n)
    public static boolean isPrime1(int n) {
    	
    	boolean isPrime=true;
    	
    	//Running loop only sqrt(n) no of times
    	for(int i=2; i*i<=n; i++) {
    		if(n%i==0)
    			isPrime = false;
    	}
    	return isPrime;
    }
	
}
