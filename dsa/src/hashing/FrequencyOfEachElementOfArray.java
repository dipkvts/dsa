package hashing;

public class FrequencyOfEachElementOfArray {

	public static void main(String[] args) {
		int[] elementArr = {5, 6, 5, 6, 9, 6};

		//write logic to find max valued element
		
		//create hash array (ie with size: maxValue+1)
		int[] hashElementArr = new int[9+1];
		
		//populate frequency
		for(int element : elementArr) {
			hashElementArr[element]++;
		}
		
		System.out.println("Frequency of 6 :: " + hashElementArr[6]);
		System.out.println("Frequency of 5 :: " + hashElementArr[5]);
	}
	
}
