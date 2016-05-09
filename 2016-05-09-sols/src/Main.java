public class Main {
  public static void main(String[] args) {
    Box var1 = new Box();
    Pill var2 = new Jar();
    Box var3 = new Cup();
    Box var4 = new Jar();
    Object var5 = new Box();
    Pill var6 = new Pill();
  }
}

class Cup extends Box {
  public void method1() {
    System.out.println("Cup 1");
  }

  @Override
  public void method2() {
    System.out.println("Cup 2");
    super.method2();
  }
}

class Pill {
  public void method2() {
    System.out.println("Pill 2");
  }
}

class Jar extends Box {
  public void method1() {
    System.out.println("Jar 1");
  }

  @Override
  public void method2() {
    System.out.println("Jar 2");
  }
}

class Box extends Pill {
  @Override
  public void method2() {
    System.out.println("Box 2");
  }

  public void method3() {
    method2();
    System.out.println("Box 3");
  }
}
