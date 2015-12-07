public class ArrayList implements List {
    private final static int DEFAULT_SIZE = 20;
    private Object[] intArray;
    private int numberOfElements;

    public ArrayList() {
        intArray = new Object[DEFAULT_SIZE];
        numberOfElements = 0;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public ReturnObject get(int index) {
        if (index < 0 || index >= numberOfElements) {
            return new ReturnObjectImp(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            return new ReturnObjectImp(intArray[index]);
        }
    }

    @Override
    public ReturnObject remove(int index) {
        return null;
    }

    @Override
    public ReturnObject add(int index, Object item) {
        return null;
    }

    @Override
    public ReturnObject add(Object item) {
        return null;
    }
}
