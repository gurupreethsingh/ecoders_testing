package star_patterns;

public class Pattern170{

//	public static void main(String[] args)
//	{
//		int a = 0;
//		for(int i=1;i<=7;i++)
//		{
//			if(i< 5) { a++; } else { a--; } 
//			for(int j=1;j<=4;j++)
//			{
//				if(j<=a)
//				{
//					System.out.print("*"); 
//				}
//				else
//				{
//					System.out.print(" "); 
//				}
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args)
//	{
//		int a = 5;
//		for(int i=1;i<=7;i++)
//		{
//			if(i< 5) { a--; } else { a++; } 
//			for(int j=1;j<=4;j++)
//			{
//				if(j>=a)
//				{
//					System.out.print("*"); 
//				}
//				else
//				{
//					System.out.print(" "); 
//				}
//			}
//			System.out.println();
//		}
//	}
	
	
	public static void main(String[] args)
	{
		int a = 5; int b = 3;
		for(int i=1;i<=7;i++)
		{
			if(i< 5) { a--; b++; } else { a++; b--; } 
			for(int j=1;j<=7;j++)
			{
				if(j>=a && j<=b)
				{
					System.out.print("*"); 
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