package q5;

public class Guitar implements WoodenObject, MusicalInstrument {

    @Override
    public void play() {
        System.out.println("PLAY");
    }

    @Override
    public void burn() {
        System.out.println("BURN");
    }

    public void bang() {
        System.out.println("BANG");
    }
}