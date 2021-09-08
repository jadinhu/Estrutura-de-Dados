package champion;

public class Alistar extends Champion
{
	public Alistar() {
		setArmor(24);
		setHitPoints(613);
		setMagicalAttack(0);
		setMagicalDefense(32);
		setMoveSpeed(330);
		setPhysicalAttack(61);
		setName("Alistar");
	}
	
	@Override
	public void move() {
		System.out.println("Alistar se move exibindo seus chifres com " + getMoveSpeed() + " de movimento.");
	}
}
