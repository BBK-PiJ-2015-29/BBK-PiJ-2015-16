package q8;

public class Beetle extends FlyingAnimal {

    public Beetle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Beetle sounds...");
    }
}