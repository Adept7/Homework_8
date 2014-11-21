package homework8;

public class Weapon
{
	private double Damage;
	private double AttackSpeed;
	private double MissChance;

	public Weapon(double NewDamage, double NewAttackSpeed, double NewMissChance)
	{
		Damage = NewDamage;
		AttackSpeed = NewAttackSpeed;
		MissChance = NewMissChance;
	}

	@Override
	public int hashCode()
	{
		int hash1 = new Double(this.Damage).hashCode();
		int hash2 = new Double(this.AttackSpeed).hashCode();
		int hash3 = new Double(this.MissChance).hashCode();
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
			return (this.AttackSpeed == temp.AttackSpeed && this.Damage == temp.Damage 
					&& this.MissChance == temp.MissChance);
		}
		return false;
	}
}
