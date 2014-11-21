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
	 * Add an item to the hash table. data is the hash table. NewData is the Object to add to the table.
	 * @param newData the object to add to the table
	 * @param data the hash table
	 */
	public static void add(Object newData, Node[] data)
	{
		
	}

	/**
	 * Determine if the hash table in data contains the Object searchData.
	 * @param searchData the item to be found
	 * @param data the hash table to search
	 * @return index where the item is found or -1 otherwise
	 */
	public static int contains(Object searchData, Node[] data)
	{
		
	}

	/**
	 * If the given item is in the hash table, then remove it.
	 * @param removeData
	 * @param data
	 */
	public static void remove(Object removeData, Node[] data)
	{
		
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
		
	}

	/**
	 * Create a new hash table that is twice the size of the old one. Reallocate all elements TO 
	 * NEW POSITIONS in the new hash table.
	 * @param data the hash table to reallocate
	 */
	public static Node[] resize(Node[] data)
	{
		
	}
}
