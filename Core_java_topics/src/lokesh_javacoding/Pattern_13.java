package lokesh_javacoding;

public class Pattern_13 
{
	public static void main(String[] args) 
	{
		int num = 1; int num2 = 10;
		for(int i = 1; i<=5 ; i++)
		{
			int k = num;  int k2 = num2;
			for(int j= 1; j<=5; j++)
			{
				if(j%2!=0)
				{
					System.out.print(k+" ");
					k = k+10;
				}
				else
				{
					System.out.print(k2+" ");
					k2 = k2+10;
				}
			}
			System.out.println();
			num = num +1;
			num2 = num2-1;
		}
	}


}
