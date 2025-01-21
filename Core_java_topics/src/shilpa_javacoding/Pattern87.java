
package shilpa_javacoding;

public class Pattern87 {

	public static void main(String[] args) 
	{
		
		for(int i = 1; i<=5 ; i++)
		{
			int num=65;
			for(int j= 1; j<=5; j++)
			{
				if(j<=6-i)
				{
					
					System.out.print((char)num+" ");
					num++;
						
				}
			}
			System.out.println();
			
		}
	}
}