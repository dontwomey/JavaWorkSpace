
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 198;
		boolean primeCheck = isPrime(num);
		System.out.println(primeCheck);

	}

	public static boolean isPrime(int num) {
		
		boolean flag = true;
		for (int i = 2; i <= num/2; i++){
			if (num % i == 0){
				flag = false;
			}
			
		}
		
		return flag;
	}
}