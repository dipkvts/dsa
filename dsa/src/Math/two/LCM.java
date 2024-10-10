package Math.two;

public class LCM {

	public static void main(String[] args) {
		
//		int n1=4, n2=6, output=12;
//		int n1=3, n2=5, output=15;
//		int n1=4, n2=12, output=12;
		
		int n1=4, n2=6;
		
		int output=LCM(n1, n2);
		
		System.out.println("LCM is :: " + output);
	}
	

	//BRUTEFORCE
	//TC: O(n1*n2)
    public static int LCM(int n1, int n2) {

    	int LCM=0;
    	int biggerNumber=n1>n2 ? n1 : n2;
    	
    	for(int i=1; i<=n1*n2; i++) {
    		if(((biggerNumber*i)%n1==0) && ((biggerNumber*i)%n2==0)) {
    			LCM=biggerNumber*i;
    			break;
    		}
    	}
    	
    	return LCM;
    }
    
    
    //BETTER
    //TC: O(min(n1,n2))
    public static int LCM1(int n1, int n2) {

    	int LCM=0;
    	int biggerNumber=n1>n2 ? n1 : n2;
    	int smallerNumber=n1>n2 ? n2 : n1;
    	
    	//To know common multiplier, we will need to increment value of i maximum upto the smaller number only
    	//LCM hamesha bigger no ya ussey bada hi hoga (isliye multiplying in bigger no)
    	for(int i=1; i<=smallerNumber; i++) {
    		if(((biggerNumber*i)%n1==0) && ((biggerNumber*i)%n2==0)) {
    			LCM=biggerNumber*i;
    			break;
    		}
    	}
    	
    	return LCM;
    }
}
