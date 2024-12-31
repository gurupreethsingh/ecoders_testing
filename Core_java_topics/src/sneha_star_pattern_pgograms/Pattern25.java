package sneha_star_pattern_pgograms;

public class Pattern25 {

	public static void main(String[] args)
	{ int num1=1; int num2=0;
		for(int i = 1; i<=5 ; i++)
		{
			int k=num1;
			for(int j= 1; j<=5; j++)
			{
				if(j%2!=0)
				{
					System.out.print(num1);
					k--;
				}
				else
				{
					System.out.print(num2);
				}
			}
			System.out.println();
		}
       }
}
