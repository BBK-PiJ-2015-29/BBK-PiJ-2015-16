package q6_2;

public class LinkedKeyValuePairImpl<T, U> implements LinkedKeyValuePair<T,U> {
    private T key;
    private U value;
    private LinkedKeyValuePair next;

    public LinkedKeyValuePairImpl(T key, U value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public U getValue() {
        return this.value;
    }

    @Override
    public LinkedKeyValuePair getNext() {
        return this.next;
    }

    @Override
    public void setNext(LinkedKeyValuePair next) {
        this.next = next;
    }

}