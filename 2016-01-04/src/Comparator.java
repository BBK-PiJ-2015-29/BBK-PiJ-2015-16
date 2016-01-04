public class Comparator<R extends Comparable<R>> {
    public R getMax(R n, R m) {
//        if (n.compareTo(m) > 0)         // no operator overloading? Fix it!
//            return n;
//        else
//            return m;
        return (n.compareTo(m) > 0 ? n : m);
    }

    public static void main(String[] args) {
        Comparator c = new Comparator();
        System.out.println(c.getMax(3, 4));
        System.out.println(c.getMax(3.1, 4.1));
        System.out.println(c.getMax("10", "20"));
    }
}
