package x5_PrimeDivisors;

public class PrimeDivisorScript {

    public static void main(String[] args) {
        PrimeDivisorList l = new PrimeDivisorListImpl();
        l.add(2);
//		l.add(2);

        l.add(3);
        l.add(3);
//		l.add(3);

//		l.add(5);
//		l.add(5);
//		l.add(5);		

//		l.add(7);
//		l.add(11);

        System.out.println(l.toString());
    }

}
