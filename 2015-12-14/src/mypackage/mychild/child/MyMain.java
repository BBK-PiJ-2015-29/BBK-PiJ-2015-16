package mypackage.mychild.child;

import mypackage.MyClass;

public class MyMain {
    public static void main(String[] args) {
        MyClass my = new MyClass("Fred",21);
        System.out.println(my);
        my.setName("John");
        System.out.println(my);
    }
}
