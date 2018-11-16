
public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum=0;
		int seconNum=1;
		
		System.out.println(firstNum + " ");
		
		System.out.println(seconNum + " ");
		
		for (int i =0; i<10; i++)
		{
			int thirdNum = firstNum+ seconNum;
			
			System.out.println(thirdNum + " ");
			
			firstNum= seconNum;
			seconNum= thirdNum;
		}

	}

}
