import java.util.ArrayList;

public class ConvertDecimalToBinary {

	public void BinaryToDecimal(int number) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		while (number > 0) {

			al.add(number % 2);
			number = number / 2;
		}

		int length = al.size()-1;

		while (length >= 0) {
			System.out.println(al.get(length));

			length--;

		}
	}

	public static void main(String[] args) {

		
		ConvertDecimalToBinary cDB = new ConvertDecimalToBinary();
		cDB.BinaryToDecimal(8);
	}

}
