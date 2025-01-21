package shilpa_javacoding;

public class Pattern60 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j<=i)
				{
					if(i==1||i==3||i==5)
					{
						System.out.print("0"+" ");
					}
					else
					{
						System.out.print("1"+" ");
					}
				}
			}
			System.out.println();
		}
	}
}
