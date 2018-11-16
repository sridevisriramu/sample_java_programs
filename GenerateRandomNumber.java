import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		GenerateRandomNumber gRn = new GenerateRandomNumber();

		gRn.RandomGen(200, 10);

	}

	public void RandomGen(int num, int noOfNum) {
		Random rr = new Random();

		for (int i = 0; i < noOfNum; i++) {
			int nnnn = rr.nextInt(num);
			System.out.println(nnnn);
		}

	}

}
