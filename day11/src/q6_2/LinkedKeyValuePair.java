package q6_2;

public interface LinkedKeyValuePair<T, U> {
    U getValue();

    LinkedKeyValuePair getNext();

    void setNext(LinkedKeyValuePair next);
}
