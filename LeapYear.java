
public class LeapYear {

	public static void main(String[] args) {

		int num = 2444;

		if ((num % 400 == 0) || ((num % 4 == 0) && (num % 100 != 0))) {
			System.out.println(num + " is  a leapyear");

		} else {
			System.out.println(num + "is  not a leapyear");

		}

	}

}
