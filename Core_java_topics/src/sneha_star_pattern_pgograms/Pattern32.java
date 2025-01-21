package sneha_star_pattern_pgograms;

public class Pattern32 {

	public static void main(String[] args)
	{ 
		int num1=65;
		for(int i = 1; i<=5 ; i++)
		{
			int k=num1;
			 for(int j= 1; j<=5; j++)
			       {
				 
					System.out.print((char)k);
					k=k+5;
			       }
			 System.out.println();
			 num1=num1+1;
			}
       }
}