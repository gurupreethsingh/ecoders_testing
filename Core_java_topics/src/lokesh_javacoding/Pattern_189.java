package lokesh_javacoding;

public class Pattern_189 {

	public static void main(String[] args)
	{
		 int a = 1;
		 int b = 10;
		for(int i = 1; i<=5 ; i++)
		{
			int x = b;  int y = a;
			for(int j= 1; j<=5; j++)
			{
				if(i%2==0)
				{
					System.out.print(x +" "); x--;
				}
				else
				{
					System.out.print(y+ " ");y++;
				}
					
			}
			System.out.println();
			if(i == 1 || i==3 || i==5) { a = a+10; } else { b = b + 10; }
		}
	}
}
