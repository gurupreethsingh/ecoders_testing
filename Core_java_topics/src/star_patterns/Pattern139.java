package star_patterns;

public class Pattern139 
{
  public static void main(String[] args)
  {
	for (int i = 1; i < 5; i++) 
	{
		for (int j = 1; j < 9; j++) 
		{
		   if(j >= 6-i && j<= 4+i)	
		   {
			   System.out.print("*");
		   }
		   else
		   {
			   System.out.print(" ");
		   }
		} // j loop ends
		System.out.println();
	}
	// i loop ends
}
  // main ends. 
}
// class ends. 
