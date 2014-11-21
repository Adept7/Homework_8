package homework8;

public class Weapon
{
	private double damage;
	private double attackSpeed;
	private double missChance;

	public Weapon(double newDamage, double newAttackSpeed, double newMissChance)
	{
		this.damage = newDamage;
		this.attackSpeed = newAttackSpeed;
		this.missChance = newMissChance;
	}

	@Override
	public int hashCode()
	{
		int hash1 = new Double(this.damage).hashCode();
		int hash2 = new Double(this.attackSpeed).hashCode();
		int hash3 = new Double(this.missChance).hashCode();
		final int HASH_MULTIPLIER = 71;
		int hash = HASH_MULTIPLIER * hash1 + hash2;
		return HASH_MULTIPLIER * hash + hash3;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other instanceof Weapon)
		{
			Weapon temp = (Weapon) other;
			return (this.attackSpeed == temp.attackSpeed && this.damage == temp.damage 
					&& this.missChance == temp.missChance);
		}
		return false;
	}
}
