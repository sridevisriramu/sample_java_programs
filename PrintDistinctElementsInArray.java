import java.util.HashMap;
import java.util.Map;

public class PrintDistinctElementsInArray {

	public static void main(String[] args) {

		int test[] = { 1, 21, 2, 1, 4, 5, 2, 7, 2 ,1};

		for (int i = 0; i < test.length; i++) {

			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (test[i] == test[j]) {
					
					isDistinct= true;
					break;

				}

			}
			if(!isDistinct)
			{
				System.out.println(test[i]+ ", ");
			}

		}

	}

}
