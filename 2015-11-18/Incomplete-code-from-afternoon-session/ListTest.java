public class ListTest {
    public static void main(String[] args) {
        Object arr[] = {1, 2, 3, 4, 5};
        ArrayList al = new ArrayList();
        System.out.println(al);

        ArrayList al2 = new ArrayList(arr);
        System.out.println(al2);

        new ArrayList(5);
        ArrayList al3 = new ArrayList(al2);
        System.out.println(al3);
    }
}
