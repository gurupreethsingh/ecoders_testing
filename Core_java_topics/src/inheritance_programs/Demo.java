package inheritance_programs;


interface Parent
{
	int money = 1000;
}

interface Raju
{
	int money1 = 2000;
}


interface Ram extends Parent, Raju
{
	
}

class Sample implements Ram
{
	
}

public class Demo {
	public static void main(String[] args) 
	{
      Sample s = new Sample();
      System.out.println(s.money);
      System.out.println(s.money1);
	}
}
