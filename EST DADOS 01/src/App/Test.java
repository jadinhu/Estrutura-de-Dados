package App;

import champion.Alistar;
import champion.Champion;

public class Test
{
	public static void main(String[] args)
	{
		Champion alistar = new Alistar();
		alistar.move();
		alistar.attack();
		alistar.backToBase();
	}
}
