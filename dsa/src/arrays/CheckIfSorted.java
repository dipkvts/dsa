package arrays;

public class CheckIfSorted {

	public static void main(String[] args) {
		//Input: n = 5, arr = [1,2,3,4,5]
		//Input: n = 5, arr = [5,4,6,7,8]
		//Input: n = 5, arr = [5,4,3,2,1]
		//Input: n = 5, arr = [5,4,6,9,8]

		int size=5;
		int[] arr= {5,4,6,9,8};

		System.out.println(arraySortedOrNot(arr, size));
	}
	
	
	//Better
	//TC: O(n)
	//SC: O(1)
    static boolean arraySortedOrNot(int[] arr, int n) {
        
    	for(int i=0; i<(n-1); i++) {
    		if(arr[i] > arr[i+1]) {
    			return false;
    		}
    	}
    	
    	return true;
    }
	
}
