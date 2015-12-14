package myabstract;

public interface MyInterface {
    int SIZE = 12;

    int moo(int i);

    static void foo(){
        System.out.println(SIZE);
    }
}
