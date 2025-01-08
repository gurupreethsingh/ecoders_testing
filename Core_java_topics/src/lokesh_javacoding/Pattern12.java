package lokesh_javacoding;


	public class Pattern12 
	{
	   public static void main(String[] args) 
	   {
		   int num = 1;
		  for(int i = 1; i<=5; i++)
		  {
			  int k = num;
			  for(int j = 1; j<=6; j++)
			  {

					  System.out.print(k +" ");
					  k = k+5;
			  }
			  System.out.println();
			  num = num+1;
		  }
	   }

}
