package star_patterns;

public class Pattern142{

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			int num=1;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i)
				{
					System.out.print(num);
					num++;
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
