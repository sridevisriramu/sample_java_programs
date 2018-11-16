
public class FibonaciSeries {

	int a = 0;
	int b = 1;
	int c = 0;

	public void fibnoci(int n) {

		if (n > 1) {
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;

			fibnoci(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 15;

		FibonaciSeries fb = new FibonaciSeries();
		fb.fibnoci(n);

	}

}
