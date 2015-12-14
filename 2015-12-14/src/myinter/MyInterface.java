package myinter;

public interface MyInterface {
    default void myMeth() {
        System.out.println("asdasd");
    }
}

interface MyLeftInterface extends MyInterface {
    @Override
    default void myMeth() {
        System.out.println("left");
    }

}

interface MyRightInterface extends MyInterface {
//    @Override
//    default void myMeth() {
//        System.out.println("right");
//    }
}

interface MyBottom extends MyLeftInterface, MyRightInterface {
//    @Override
//    default void myMeth() {
//        MyRightInterface.super.myMeth();
//        MyLeftInterface.super.myMeth();
//    }
}
