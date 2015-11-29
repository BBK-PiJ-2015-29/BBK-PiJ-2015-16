package q8;

public class NoahArkTest {

    public static void main(String[] args) {
        Cat myCat = new Cat("Black Cat");
        myCat.call();
        myCat.reproduce();
        Frog myFrog = new Frog("Frog");
        myFrog.call();
        myFrog.reproduce();
        Whale myWhale = new Whale("Blue Whale");
        myWhale.call();
        myWhale.reproduce();
        Fish myFish = new Fish("Salmon");
        myFish.call();
        myFish.reproduce();
        Eagle myEagle = new Eagle("Golden Eagle");
        myEagle.call();
        myEagle.reproduce();
        Beetle myBeetle = new Beetle("Ladybird");
        myBeetle.call();
        myBeetle.reproduce();
        System.out.println();
    }
}