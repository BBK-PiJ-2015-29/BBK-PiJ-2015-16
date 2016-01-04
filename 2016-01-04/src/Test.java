
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.foo(1);


    }
}

class A {
    public void foo() {
    }

    public int foo(int i) {
        return 0;
    }
//    public void foo(int i){ return 0;} // what if return types were in the signature

    public void goo() {
    }

//    public void goo(){} no overriding within the same class
}

class B extends A {
    @Override
    public void foo() {
    }

    public int foo(int i) {
        return super.foo(i);
    }
}
