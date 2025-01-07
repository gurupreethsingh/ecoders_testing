package lokesh_javacoding;

public class Pattern_188 {

	public static void main(String[] args)
	{
		for(int i = 1; i<=5 ; i++)
		{
			int a = 1;
			int b = 5;
					
			for(int j= 1; j<=5; j++)
			{
				if(i%2 ==0)
				{
					System.out.print(b); b--;
				}
				else
				{
					System.out.print(a); a++;
				}
			    
			}
			System.out.println();
		}
	}
}
