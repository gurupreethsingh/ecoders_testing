package lokesh_javacoding;

public class Pattern_191 {

	public static void main(String[] args)
	{
		int num = 1; 
		for(int i = 1; i<=5 ; i++)
		{
			int k = num;
			for(int j= 1; j<=5; j++)
			{
					System.out.print(k); if(k==5) {  k = 5;} else { k++;}  	
			}
			System.out.println();
			num++;
		}
	}
}
