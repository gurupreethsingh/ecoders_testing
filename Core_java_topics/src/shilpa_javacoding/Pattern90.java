
package shilpa_javacoding;

public class Pattern90 {

	public static void main(String[] args) 
	{
		int num=69;
		for(int i = 1; i<=5 ; i++)
		{
			int k=num;
			for(int j= 1; j<=5; j++)
			{
				if(j<=6-i)
				{
					
					System.out.print((char)k+" ");
					k--;
						
				}
			}
			System.out.println();
			num--;
			
		}
	}
}