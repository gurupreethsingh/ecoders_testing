package shilpa_javacoding;

public class Pattern59 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					if(i==1||i==3||i==5)
					{
						System.out.print("1"+" ");
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
