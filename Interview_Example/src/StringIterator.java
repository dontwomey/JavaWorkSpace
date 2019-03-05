import java.util.ArrayList;
import java.util.Arrays;

public class StringIterator {

	//Create method to compare 2 values in array to see if they match given number
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = 13;
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		ArrayList<int[]> matches = searchString(ans, nums);
		
		for (int[] match : matches){
			System.out.println(Arrays.toString(match));
		}
		
	}

	public static ArrayList<int[]> searchString(int ans, int[] array){
		
		ArrayList<int[]> results = new ArrayList<>();
		for (int i=0; i < array.length; i++){
			for (int j=0; j < array.length; j++){
				if (array[i] + array[j] == ans && array[i] != array[j]){
					int[] result = {i,j};
					results.add(result);		
				}
			}
		}
		
		return results;
				
	}

}
