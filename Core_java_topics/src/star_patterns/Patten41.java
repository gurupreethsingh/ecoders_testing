
package star_patterns;

public class Patten41 {

	public static void main(String[] args) 
	{
		int num=1;
		for(int i = 1; i<=4 ; i++)
		{
			for(int j= 1; j<=4; j++)
			{
				if(j<=i)
				{
					System.out.print(num+" ");
					num++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}