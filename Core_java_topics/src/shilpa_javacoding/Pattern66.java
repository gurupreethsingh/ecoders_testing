
package shilpa_javacoding;

public class Pattern66{

	public static void main(String[] args) 
	{
		int num=65;
		for(int i = 1; i<=5 ; i++)
		{
			int k=num;
			for(int j= 1; j<=5; j++)
			{	
				if(j<=i)
				{
					System.out.print((char)k+" ");
					k=k+1;
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
