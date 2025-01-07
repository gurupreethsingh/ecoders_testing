package lokesh_javacoding;

public class Pattern_190 {

	public static void main(String[] args)
	{
	  int num =1;
		for(int i = 1; i<=5 ; i++)
		{
			
			for(int j= 1; j<=5; j++)
			{
				if(j<=6-i)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(num);
				}
					  	
			}
			System.out.println();
		  num++;
		}
	}
}
