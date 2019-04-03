package test;

public class FibonacciGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 20;
		
		int[] fibSequence = generateFibSequence(length);
		
		for (int i : fibSequence){
			System.out.println(i);
		}
		

	}

	public static int[] generateFibSequence(int length) {
		
		int[] fibSequence = new int[length];
		fibSequence[0] = 0;
		fibSequence[1] = 1;
		
		for (int i = 2; i < length; i++){
			fibSequence[i] = fibSequence[i-2] + fibSequence[i-1];
		}
		
		return fibSequence;
		
	}

}
