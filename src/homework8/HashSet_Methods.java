package homework8;
//FORBIDDEN java.util.Hash

/**
 * This class contains the methods for the HashSet class. The HashSet class should be implemented 
 * as a hash table with a linked list at each slot in the array.
 * This file is simply a container for some static methods. You can write these as the same as if 
 * they were in the class itself (using the given definitions).
 * You may not add instance variables to any classes in this assignment. You may not use the data 
 * structures in the JCF to complete this assignment.
 */
public class HashSet_Methods
{
	/**
	 * Add an item to the hash table.
	 * @param newData the object to add to the table
	 * @param data the hash table
	 */
	public static void add(Object newData, Node[] data)
	{
		int hashIndex = Math.abs(newData.hashCode()) % data.length;
		Node temp = new Node(newData, data[hashIndex]);
		data[hashIndex] = temp;
	}

	/**
	 * Determine if the hash table in data contains the Object searchData.
	 * @param searchData the item to be found
	 * @param data the hash table to search
	 * @return index where the item is found or -1 otherwise
	 */
	public static int contains(Object searchData, Node[] data)
	{
		int hashIndex = Math.abs(searchData.hashCode()) % data.length;

		Node current = data[hashIndex];
		while (current != null)
		{
			if (searchData.equals(current.data)) { return hashIndex; }
			current = current.next;
		}
		return -1;
	}

	/**
	 * If the given item is in the hash table, then remove it.
	 * @param removeData
	 * @param data
	 */
	public static void remove(Object removeData, Node[] data)
	{
		int hashIndex = Math.abs(removeData.hashCode()) % data.length;

		Node current = data[hashIndex];
		Node previous = null;
		while (current != null)
		{
			if (removeData.equals(current.data) && previous == null)
			{
				data[hashIndex] = current.next;
			}
			else if (removeData.equals(current.data))
			{
				previous.next = current.next;
			}
			previous = current;
			current = current.next;
		}
	}

	/**
	 * Calculate the load on the hash table. In this case, the load is the number of items 
	 * in the hash table divided by the number of slots in the array. This count includes items 
	 * in linked lists.
	 * @param data the array to search
	 * @return the calculated load
	 */
	public static double calculateLoad(Node[] data)
	{
		int size = 0;
		for (Node current : data)
		{
			Node temp = current;
			while (temp != null)
			{
				size++;
				temp = temp.next;
			}
		}
		return  (size * 1.0) / data.length;
	}

	/**
	 * Create a new hash table that is twice the size of the old one. Reallocate all elements TO 
	 * NEW POSITIONS in the new hash table.
	 * @param data the hash table to reallocate
	 */
	public static Node[] resize(Node[] data)
	{
		Node[] newTable = new Node[data.length * 2];
		for (Node current : data)
		{
			Node temp = current;
			while (temp != null)
			{
				HashSet_Methods.add(temp.data, newTable);
				temp = temp.next;
			}
		}
		return newTable;
	}
}
