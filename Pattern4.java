
public class Pattern4 {

	public static void main(String[] args) {
		for(int i=0 ; i<10; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(j);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for(int i=10 ; i>=0; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
