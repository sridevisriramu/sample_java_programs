
public class GetTwoMaxNumberInArray {

	public static void main(String[] args) {
		int[] ss = { 34, 1, 29, 53, 2, 99, 74, 22 };

		for (int i = 0; i < ss.length; i++) {

			for (int j = i; j < ss.length; j++) {
				if (ss[i] > ss[j]) {
					int temp;
					temp = ss[i];
					ss[i] = ss[j];
					ss[j] = temp;
				}
			}

		}

		System.out.println(ss[ss.length - 1] + "," + ss[ss.length - 2]);

	}

}
