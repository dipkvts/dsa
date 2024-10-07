package Math.imp;

//Perfect prime: if sum of all its divisors(including 1) equals number itself
//output: if input 6, then 1+2+3=6 so perfect number
//output: if input 28, then 1+2+4+7+14=28 so perfect number
public class PerfectNumber {

	public static void main(String[] args) {
		int num=28;//6,4,28
		boolean result = isPerfect1(num);
		
		System.out.println("Is perfect number :: " + result);
	}
	
	
	//Bruteforce
	//TC: O(n) and NOT log n
	//Coz input just half hua hai, har iteration me half nhi ho rha hai. Abhi bhi n/2 baar traverse karna pad rha hai, jo ki almost n baar hi hua
    public static boolean isPerfect(int n) {
    	
    	if(n==1 || n==2 || n==3) return false;
    	
    	int tempNum=n;
    	int sumOfDivisors=1;
    	
    	for(int i=2; i<=tempNum/2; i++) {
    		if(tempNum%i==0) {
    			sumOfDivisors=sumOfDivisors+i;
    		}
    	}
    	
    	return n==sumOfDivisors;
    }
    
    
    //Optimal
    //TC: O(sqrt(n))
    //Logic: Traversing number only till sqrt of n (so that we can cover all possibilities). Coz if 'i' is a divisor of number 'n', then 'n/i' will also be divisor of n 
	public static boolean isPerfect1(int n) {

		int sum = 0;

		//i*i<=n; is nothing but sqrt of n ie (int)Math.sqrt(n)
		for (int i=1; i*i<=n; i++) {
			if (n%i == 0) {
				sum = sum+i;
				//Excluding repeating number and 1
				if ((i != (n/i)) && (i != 1))
					sum = sum + (n/i);
			}
		}

		return sum == n;
	}
	
}
