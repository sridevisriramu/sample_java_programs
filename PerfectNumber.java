
public class PerfectNumber {

	public static void main(String[] args) {

		int num = 28;
		int temp = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				temp = temp + i;

			}

		}
		if (temp == num) {
			System.out.println(num + " is a perfect nukber");
		} else {
			System.out.println(num + "is not a perfect number");
		}
	}

}
