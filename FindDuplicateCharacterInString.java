import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterInString {

	static String OriginalString = "testabetteaataezaa";

	public void findDuplicateString(String OriginalString) {

		char[] test = OriginalString.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int i = 0; i < test.length; i++) {

			if (charMap.containsKey(test[i])) {
				charMap.put(test[i], charMap.get(test[i]) + 1);
			} else {
				charMap.put(test[i], 1);

			}

		}
		System.out.println(charMap);

	}

	public static void main(String[] args) {

		FindDuplicateCharacterInString fd = new FindDuplicateCharacterInString();

		fd.findDuplicateString(OriginalString);

	}
}
