package star_patterns;

public class Pattern128{

	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			boolean flag = true;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i && flag)
				{
					System.out.print("*"); flag = false;
				}
				else
				{
					System.out.print(" ");  flag = true;
				}
			}
			System.out.println();
		}
		
	}

}
