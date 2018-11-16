
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 14;
		boolean isPrime = false;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				System.out.println("num is  a not prime");
				isPrime = true;
				break;

			}

		}
		if (isPrime == false) {
			System.out.println("num is  a prime");

		}

	}

}
