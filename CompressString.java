
public class CompressString {

	static String ss = "aaaabbbbdddddcceee";

	public void CompString(String sr) {
		int count = 0;
		char temp = ss.charAt(0);

		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i) == temp) {
				count++;
			} else {
				System.out.println(temp +""+ count);
				count = 1;
				temp = ss.charAt(i);
			}

		}
	}

	public static void main(String[] args) {

		CompressString cs = new CompressString();
		cs.CompString(cs.ss);

	}

}
