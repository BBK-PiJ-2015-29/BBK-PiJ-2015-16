// An ordered list of integers.
//
// This interface allows clients to write general methods that work
// with any class that implements IntList

public interface IntList {
   public void add(int value);
   public void add(int index, int value);
   public int get(int index);
   public int size();
   public void remove(int index);  
}
