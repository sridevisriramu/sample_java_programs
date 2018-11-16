
public class IsAnagram {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dcbae";

		StringBuilder secondString = new StringBuilder(s2);

		char [] s1CharArray = s1.toCharArray();
		for (int i = 0; i < s1CharArray.length; i++) {
			int index = s2.indexOf(s1.charAt(i));

			if (index != -1) {
				secondString.deleteCharAt(index);

			}
		}
		if (secondString.length() != 0) {
			System.out.println("stings are not anagrams");
		} else
		{
			System.out.println("stings are  anagrams");

		}
	}

}
