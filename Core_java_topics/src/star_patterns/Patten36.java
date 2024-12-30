
package star_patterns;

public class Patten36 {

	public static void main(String[] args) 
	{
		
		for(int i = 1; i<=5 ; i++)
		{
			int num=1;
			for(int j= 1; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print(num);
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