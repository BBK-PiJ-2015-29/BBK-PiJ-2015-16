package myinter;

public class MyMain {
    public static void main(String[] args) {
        MyInterface my = new MyClass();
        my.myMeth();
    }
}

class MyClass implements MyBottom {

}