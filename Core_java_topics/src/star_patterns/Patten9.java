package star_patterns;

public class Patten9 {

	public static void main(String[] args) 
	{
		int num=1;
		for(int i = 1; i<=5 ; i++)
		{
			int k=num;
			for(int j= 1; j<=5; j++)
			{
					System.out.print(k+" ");
					k=k+i;
			}
			System.out.println();
			num=num+1;
		}
	}
}