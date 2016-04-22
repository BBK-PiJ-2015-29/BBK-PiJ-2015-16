package x5_PrimeDivisors;

public interface PrimeDivisorList {

	/*
    * @param Integer to be added to the list
	* adding null @throws a NullPointerException
	* adding a non-prime @throws an IllegalArgumentException
	*/

    void add(Integer i) throws NullPointerException, IllegalArgumentException;
	
	/*
	 * @return Integer from list
	 */

    Integer remove();
	
	/*
	 * @ return a fancy string based on the list
	 */

    @Override
    String toString();
}
