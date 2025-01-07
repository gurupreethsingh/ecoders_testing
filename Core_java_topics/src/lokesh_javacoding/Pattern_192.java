package lokesh_javacoding;

public class Pattern_192 {

	public static void main(String[] args)
	{
		int num = 1;  
		for(int i = 1; i<=5 ; i++)
		{
			int k = num;  int y = 5;
			for(int j= 1; j<=5; j++)
			{
				if(j<=6-i)
				{
					System.out.print(k); k++;  y--;
				}
				else
				{
					System.out.print(y);
					y--;
				}		
			}
			System.out.println();
			num++;
		}
	}
}
