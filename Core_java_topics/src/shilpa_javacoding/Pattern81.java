
package shilpa_javacoding;

public class Pattern81 {

	public static void main(String[] args) 
	{
		int num=1;
		for(int i = 1; i<=5 ; i++)
		{
			for(int j= 1; j<=5; j++)
			{
				if(j<=6-i)
				{
					if(i==1||i==3||i==5)
					{
						System.out.print(num+" ");
						
					}
					else
					{
						System.out.print("0"+" ");
					}
				}
				
			}
			System.out.println();
		}
	}
}