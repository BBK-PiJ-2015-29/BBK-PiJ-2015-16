package q8;

public class Eagle extends FlyingAnimal {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("++ very loud squawk +++");
    }
}