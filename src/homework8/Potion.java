package homework8;

public class Potion
{
	private double Size;
	private int Type; // 0, 1, 2, 3 ... etc. A flag value.

	public Potion(double NewSize, int NewType)
	{
		Size = NewSize;
		Type = NewType;
	}
	
	@Override
	public int hashCode()
	{
		int hash1 = new Double(this.Size).hashCode();
		int hash2 = this.Type;
		final int HASH_MULTIPLIER = 47;
		return HASH_MULTIPLIER * hash1 * hash2;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other instanceof Potion)
		{
			Potion temp = (Potion) other;
			return (this.Size == temp.Size && this.Type == temp.Type);
		}
		return false;
	}
}
