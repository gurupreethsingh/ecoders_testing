
package star_patterns;

public class Patten42 {

	public static void main(String[] args) 
	{
		int num=1;
		for(int i = 1; i<=5 ; i++)
		{
			int k=num;
			for(int j= 1; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print(k+" ");
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			num++;
		}
	}
}