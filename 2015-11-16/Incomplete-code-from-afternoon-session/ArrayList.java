public class ArrayList implements List {
    private static final int INITIAL = 10;
    private Object[] arr;
    private int numberOfElements = 0;
    
    public ArrayList(){
        this(INITIAL);
    }    
    
    public ArrayList(Object[] objs){
        this(INITIAL);
        if (objs.length > 0 ){
            arr = new Object[objs.length];
            numberOfElements = objs.length;
            // copy over elements
            
        }
    }
    
    public ArrayList(int size){
        arr = new Object[size];
        numberOfElements = 0;
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }

    /**
     * Returns the number of items currently in the list.
     * 
     * @return the number of items currently in the list
     */
    public int size(){
        return numberOfElements;
    }

    /**
     * Returns the element at the given position. 
     * 
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     * 
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message, 
     *         encapsulated in a ReturnObject
     */
    public ReturnObject get(int index){
        if (index < 0 || index >= numberOfElements)
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            
        return new ReturnObjectImpl(arr[index]);
    }

    /**
     * Returns the elements at the given position and removes it
     * from the list. The indeces of elements after the removed
     * element must be updated accordignly.
     * 
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     * 
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message, 
     *         encapsulated in a ReturnObject
     */
    public ReturnObject remove(int index){
        if (index < 0 || index >= numberOfElements)
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        Object obj = arr[index];
        // shove items up
        return new ReturnObjectImpl(obj);
    }

    /**
     * Adds an element to the list, inserting it at the given
     * position. The indeces of elements at and after that position
     * must be updated accordignly.
     * 
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     * 
     * If a null object is provided to insert in the list, the
     * request must be ignored and an appropriate error must be
     * returned.
     * 
     * @param index the position at which the item should be inserted in
     *              the list
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful
     *         or containing an appropriate error message otherwise
     */
    public ReturnObject add(int index, Object item){
        return new ReturnObjectImpl(null);
    }

    /**
     * Adds an element at the end of the list.
     * 
     * If a null object is provided to insert in the list, the
     * request must be ignored and an appropriate error must be
     * returned.
     * 
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful
     *         or containing an appropriate error message otherwise
     */
    public ReturnObject add(Object item){
        return add(numberOfElements, item);
    }
}