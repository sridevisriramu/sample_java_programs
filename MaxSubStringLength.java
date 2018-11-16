
public class MaxSubStringLength {

	public static void main(String[] args) {

		String s = "bcdasdfghahjuytaiouttfghjk";

		String[] ss = s.split("a");

		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);

			for (int j = i; j < ss.length; j++) {
				if (ss[i].length() > ss[j].length()) {
					String temp;
					temp = ss[i];
					ss[i] = ss[j];
					ss[j] = temp;
				}
			}

		}

		System.out.println(ss[ss.length - 1].length());

	}

}
