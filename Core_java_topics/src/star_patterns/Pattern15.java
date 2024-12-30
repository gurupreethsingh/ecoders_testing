package star_patterns;

public class Pattern15 {

	public static void main(String[] args) 
	{
		int num1 = 5; int num2 = 6;
		for(int i = 1; i<=5 ; i++)
		{
			int k = num1;  int k2 = num2;
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
			num1 = num1-1;
			num2 = num2+1;
		}
	}
}
