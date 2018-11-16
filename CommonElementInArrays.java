
public class CommonElementInArrays {
	public static void main(String[] args) {

		int[] a1 = { 2, 5, 3, 9, 21, 7 , 76};
		int[] a2 = { 32, 45, 5, 76, 3, 9, 21, 33, 29 };
	
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {

				if (a1[i] == a2[j]) {
					System.out.println(a1[i] + ", ");

				}

			}
		}

	}
}