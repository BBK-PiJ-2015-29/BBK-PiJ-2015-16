package q1;

public class Comparator<T extends Comparable<T>>{

    public T getMax(T a, T b){
        return (a.compareTo(b) < 0) ? a : b;
    }
}