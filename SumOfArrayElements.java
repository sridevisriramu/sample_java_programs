
public class SumOfArrayElements {

	public static void main(String[] args) {

		
		int [] test = {34, 23, 2, 1};
		int count=0;
		
		for(int i=0; i<=test.length-1; i++)
		{
			count = count + test[i];
			
		}
		
		System.out.println(count);

	}

}
