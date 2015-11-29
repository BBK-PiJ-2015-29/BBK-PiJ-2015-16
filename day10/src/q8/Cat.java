package q8;

public class Cat extends LandAnimal implements Mammal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("++ meow +++");
    }

}