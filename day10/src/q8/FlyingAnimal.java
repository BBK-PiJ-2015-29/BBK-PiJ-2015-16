package q8;

public abstract class FlyingAnimal implements Animal, LayEggs {
    private String name;

    public FlyingAnimal(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("\n" + this.name + " now flying, will come later when tired...\n");
    }

    @Override
    public void reproduce() {
        System.out.println("Rain Stops... Reproduce...");
        layEggs();
    }

    @Override
    public void layEggs() {
        System.out.println(name + " Laying eggs");
    }
}