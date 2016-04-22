package q8;

public abstract class LandAnimal implements Animal, Mammal {

    private String name;

    public LandAnimal(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println();
        System.out.println(this.name + " coming");
    }

    @Override
    public void reproduce() {
        System.out.println("Rain Stops... Reproduce...");
        giveBirth();
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " Give birth!");
    }
}