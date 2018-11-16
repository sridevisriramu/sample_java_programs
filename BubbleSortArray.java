
public class BubbleSortArray {

	public static void main(String[] args) {

		
		int test [] = {4, 1, 38, 21, 39, 15};
		int temp =0;
		
		for (int i =0; i<test.length; i++)
		{
			for(int j=i+1; j<test.length; j++)
			{
				if(test[i]>test[j])
				{
					temp = test[i];
					test[i]= test[j];
					test[j]= temp;
					
				}
			}
		}
		
		for (int i =0; i<test.length; i++)
		{
		
		System.out.println(test[i]);
		}

	}

}
