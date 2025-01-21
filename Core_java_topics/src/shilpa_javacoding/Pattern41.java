
package shilpa_javacoding;

public class Pattern41 {

	public static void main(String[] args) 
	{
		int num=1;
		for(int i = 1; i<=4 ; i++)
		{
			int k=num;
			for(int j= 1; j<=4; j++)
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
			num=num+i;	
		}
	}
}
