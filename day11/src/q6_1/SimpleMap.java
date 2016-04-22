package q6_1;

public interface SimpleMap<T, U> {
    void put(T key, U value);

    U get(T key);

    boolean remove(T key);
}
