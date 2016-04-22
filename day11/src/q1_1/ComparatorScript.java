package q11;

public class ComparatorScript {

    public static void main(String[] args) {
        Comparator comp = new Comparator();
        System.out.println(comp.getMax(5, 6));
        System.out.println(comp.getMax("50", "60"));
        System.out.println(comp.getMax(1.2, 1.3));
    }
}