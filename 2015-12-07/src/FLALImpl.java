
public class FLALImpl extends ArrayList implements FunctionalList {
    @Override
    public ReturnObject head() {
        return null;
    }

    @Override
    public FunctionalList rest() {
        return null;
    }
}

class A {

}

class B extends A { // implementation inheritance

}

class C { // composition
    B b;

}