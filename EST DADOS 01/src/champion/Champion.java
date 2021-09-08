package champion;

public abstract class Champion
{
	private String name;
	private int physicalAttack;
	private int magicalAttack;
	private int hitPoints;
	private int armor;
	private int magicalDefense;
	private int moveSpeed;

	public void attack()
	{
		System.out.println(this.name + " is attacking with " + this.physicalAttack + " attack points!");
	}

	public void move()
	{
		System.out.println(this.name + " has moved with " + this.moveSpeed + " of speed.");
	}

	public void backToBase()
	{
		System.out.println(this.name + " is going to the Nexus.");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPhysicalAttack()
	{
		return physicalAttack;
	}

	public void setPhysicalAttack(int physicalAttack)
	{
		this.physicalAttack = physicalAttack;
	}

	public int getMagicalAttack()
	{
		return magicalAttack;
	}

	public void setMagicalAttack(int magicalAttack)
	{
		this.magicalAttack = magicalAttack;
	}

	public int getHitPoints()
	{
		return hitPoints;
	}

	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}

	public int getArmor()
	{
		return armor;
	}

	public void setArmor(int armor)
	{
		this.armor = armor;
	}

	public int getMagicalDefense()
	{
		return magicalDefense;
	}

	public void setMagicalDefense(int magicalDefense)
	{
		this.magicalDefense = magicalDefense;
	}

	public int getMoveSpeed()
	{
		return moveSpeed;
	}

	public void setMoveSpeed(int moveSpeed)
	{
		this.moveSpeed = moveSpeed;
	}
}
