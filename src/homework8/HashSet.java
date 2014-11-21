package homework8;

public class HashSet
{
	Node[] data;
	private static final int INITIAL_SIZE = 23;

	public HashSet()
	{
		this.data = new Node[INITIAL_SIZE];
	}

	public void add(Object newData)
	{
		HashSet_Methods.add(newData, this.data);
	}

	public int contains(Object searchData)
	{
		return HashSet_Methods.contains(searchData, this.data);
	}
	public boolean containsBool(Object searchData)
	{
		return (HashSet_Methods.contains(searchData, this.data) == -1) ? false : true;
	}


	public void remove(Object removeData)
	{
		HashSet_Methods.remove(removeData, this.data);
	}

	public double calculateLoad()
	{
		return HashSet_Methods.calculateLoad(this.data);
	}

	public void reallocate()
	{
		this.data = HashSet_Methods.resize(this.data);
	}
}
