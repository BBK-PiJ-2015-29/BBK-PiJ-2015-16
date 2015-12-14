package myabstract;

public class MyMain {
    public static void main(String[] args) {
        MyInterface.foo();     // how odd?
        MyInterface my;

        (new MyClass()).ouch();

        my = new MyClass();
        my.moo(3);
        my = new MyOtherClass();
        my.moo(5);
    }
}
