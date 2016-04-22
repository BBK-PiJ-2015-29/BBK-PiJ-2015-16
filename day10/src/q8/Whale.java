package q8;

public class Whale extends AquaticAnimal implements Mammal {

    public Whale(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("++ bosh +++");
    }

    @Override
    public void giveBirth() {
        System.out.println(getName() + " giving birth!");
    }
}