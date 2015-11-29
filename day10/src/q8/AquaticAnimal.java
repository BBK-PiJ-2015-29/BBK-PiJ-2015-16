package q8;

public abstract class AquaticAnimal implements Animal, LayEggs {

    private String name;

    public AquaticAnimal(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println();
        System.out.println(name + " will not come");
    }

    @Override
    public void reproduce() {
        System.out.println("Rain Stops... Reproduce...");
        layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public String getName() {
        return name;
    }

    @Override
    public void layEggs() {
        System.out.println(name + " laying eggs");
    }
}