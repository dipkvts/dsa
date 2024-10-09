package arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		//Input: n=5, arr = [1,2,3,4,5], Output: [5,4,3,2,1]
		//Input: n=6, arr = [1,2,1,1,5,1], Output: [1,5,1,1,2,1]
		int size=6;
		int[] arr = {1,2,1,1,5,1};
		
		reverse(arr, size);
	}
	
	
	//BETTER
	//TC: O(n/2)
	//SC: O(1) since a constant no of variable (actually only 1 variable "temp") is required
    public static void reverse(int[] arr, int n) {
    	   
    	//loop condition is imp here (be it even or odd size, both scenarios will get covered by this)
    	for(int i=0; i<=(n-1)/2; i++) {
    		int temp=arr[i];
    		arr[i]=arr[n-1-i];
    		arr[n-1-i]=temp;
    	}
    	
    	System.out.println("Reversed array is :: ");
    	for(int i: arr) {
    		System.out.println(i);
    	}
    }
}
