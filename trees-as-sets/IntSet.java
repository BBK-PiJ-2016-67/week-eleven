public interface IntSet {
	
	/**
	 * adds a new int to the set; if it is there already, nothing happens
	 */
	public void add(int value);

	/**
	 * returns true if the number is in the set, false otherwise
	 */
	public boolean contains(int value);

	/**
	 * returns the same values as the former method, but for
	 * every element that is checked prints its value on screen
	 */
	public boolean containsVerbose(int value);

	/**
	 * returns a string with the values of the elements in the set separated by commas
	 */
	public String toString();

}