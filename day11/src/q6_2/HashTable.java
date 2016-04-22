package q6_2;

/**
 * Created by keith on 01/12/2015.
 */
public interface HashTable<T, U> {
    void put(T key, U value);

    // returns value on basis of stack (LIFO) within each key value of table
    // values not removed, but could do easy.
    // CAN"T / DON'T KNOW HOW TO RETURN AN ARRAY OF U'S (ARRAY & GENERIC BAD VIBES!)
    U get(T key);

    //removes all values under that key
    boolean remove(T key);
}
