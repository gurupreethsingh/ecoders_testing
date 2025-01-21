
package shilpa_javacoding;

public class Pattern29{

	public static void main(String[] args) 
	{
		for(int i = 1; i<=5 ; i++)
		{
			int num=69;
			
			for(int j= 1; j<=5; j++)
			{
				System.out.print((char)num+" ");
				num--;
			}
			System.out.println();	
		}
	}
}