package q8;

public class Fish extends AquaticAnimal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("++ bubbles +++");
    }

}