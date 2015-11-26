package example;

// java MyClass

// MyClass.main()

public class MyClass {
    public final static int MAX = 10;

    public static void main(String[] args) {
        // MyClass.MAX = 200;

        //System.out.println(MyInnerClass.getI());
//        new MyInnerClass();
//        new MyInnerClass();
//        new MyInnerClass();
//        new MyInnerClass();
//        new MyInnerClass();
//        MyInnerClass mic = new MyInnerClass();
//        System.out.println(mic.count);

//        System.out.println(MyClass.i);
//
//        MyClass m = new MyClass();
//        System.out.println(m.j);
//
//        MyClass n = new MyClass();
//
//        System.out.println(MyClass.i++);
//        n.j = 13;
//        System.out.println(n.j);
//        n.i = 99;
//        System.out.println(n.i);
//
//        System.out.println(m.i);
    }

}

class MyInnerClass {
    private static int i = 12;  // changed from public
    public int j = 15;
    static int count = 0;

    public MyInnerClass() {
        count++;
    }

    public static int getI() {
        return i;
    }

    public void setJ(int val){
        j = val;
    }
}
