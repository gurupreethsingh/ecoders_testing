
package shilpa_javacoding;

public class Pattern88 {

	public static void main(String[] args) 
	{
		int num=65;
		for(int i = 1; i<=5 ; i++)
		{
			for(int j= 1; j<=5; j++)
			{
				if(j<=6-i)
				{
					
					System.out.print((char)num+" ");
						
				}
			}
			System.out.println();
			num++;
		}
	}
}