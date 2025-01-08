package lokesh_javacoding;

public class Pattern_10 
{
	 public static void main(String[] args) 
	   {
		   int b = 1;
		  for(int i = 1; i<=5; i++)
		  {
			  int a= 1;
			  for(int j = 1; j<=6; j++)
			  {
				  if(j%2 == 0)
				  {
					  System.out.print(b +" ");
				  }
				  else
				  {
					  System.out.print(a +" ");
					  a = a+1;
				  }	  
			  }
			  System.out.println();
			  b = b+1;
		  }
	   }

}
