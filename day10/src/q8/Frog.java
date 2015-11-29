package q8;

public class Frog extends AquaticAnimal {

    public Frog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("++ croak +++");
    }

}