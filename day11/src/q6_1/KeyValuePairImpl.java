package q6_1;

public class KeyValuePairImpl<T, U> implements KeyValuePair<T,U> {
    private T key;
    private U value;

    public KeyValuePairImpl(T key, U value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public U getValue() {
        return this.value;
    }

}