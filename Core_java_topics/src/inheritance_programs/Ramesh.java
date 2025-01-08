package inheritance_programs;

// IS A relation ship, Single level
// multi level.
// hirarchical ( 1 parent - multiple children relation ship.
// hybrid
// multiple inheritance  ( 1 child , taking multiple parent) interface is possible

class Raj
{
	int money = 1000;
}

class Mahesh  extends Raj
{
	
}


class Suresh extends Mahesh
{
	
}


public class Ramesh extends Mahesh{
	// int money = 1000;

	public static void main(String[] args) 
	{
		Ramesh r = new Ramesh();
		System.out.println(r.money);

	}

}
