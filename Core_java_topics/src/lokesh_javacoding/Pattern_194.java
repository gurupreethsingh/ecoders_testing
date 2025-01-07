package lokesh_javacoding;

public class Pattern_194 {

	public static void main(String[] args)
	{
		for(int i = 1; i<=5 ; i++)
		{
			int k = 5;
			for(int j= 1; j<=5; j++)
			{
				if(j>=i)
				{
					System.out.print(k); k--;
				}
				else
				{
					System.out.print(1);
				}		
			}
			System.out.println();
		}
	}
}
