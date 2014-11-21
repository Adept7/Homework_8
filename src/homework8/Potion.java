package homework8;

public class Potion
{
	private double size;
	private int type; // 0, 1, 2, 3 ... etc. A flag value.

	public Potion(double newSize, int newType)
	{
		this.size = newSize;
		this.type = newType;
	}
	
	@Override
	public int hashCode()
	{
		int hash1 = new Double(this.size).hashCode();
		int hash2 = this.type;
		final int HASH_MULTIPLIER = 47;
		return HASH_MULTIPLIER * hash1 * hash2;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other instanceof Potion)
		{
			Potion temp = (Potion) other;
			return (this.size == temp.size && this.type == temp.type);
		}
		return false;
	}
}
