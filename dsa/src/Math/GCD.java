package Math;

public class GCD {

	public static void main(String[] args) {
		//Input: n1=4,n2=6 then Output:2
		//Input: n1=9,n2=8 then Output:1
		//Input: n1=12,n2=6 then Output:6
		int num1=35;
		int num2=10;
		
		System.out.println("GCD of 2 numbers is :: " + GCD1(num1, num2));
		
	}
	
	
	//BRUTEFORCE
	//TC: O(min(n1,n2))
	//SC: O(1)
    public static int GCD(int n1, int n2) {
    	int GCD=1;
    	for(int i=2; ((i<=n1) && (i<=n2)); i++) {
    		if((n1%i==0) && (n2%i==0)) {
    			//if(GCD < i) //Not necessary as i is anyway incrementing so it will always have GREATEST value
    				GCD=i;
    		}
    	}
    	
    	return GCD;
    }
    
    
    //BETTER
    //TC: O(min(n1,n2))
    //Since greatest divisor is to be find out, so its better to iterate from greatest side and not from 1 
    public static int GCD1(int n1, int n2) {
    	int GCD=1;
    	for(int i=Math.min(n1, n2); i>=1; i--) {
    		if((n1%i==0) && (n2%i==0)) {
    			GCD=i;
    			break;
    		}
    	}
    	return GCD;
    }
    
}
