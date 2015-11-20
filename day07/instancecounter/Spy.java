package instancecounter;

public class Spy {

    private static int spyCount = 0;
    private int spyID;

    public Spy(int spyID) {
        spyCount++;
        this.spyID = spyID;
        System.out.println("Spy ID: " + this.spyID + ". Spy count: " + spyCount);
    }

    public static void main(String[] args) {
        Spy spy1 = new Spy(666);
        Spy spy2 = new Spy(123);
        Spy spy3 = new Spy(456);
        spy2.die();
        spy1.die();
    }

    public void die() {
        System.out.println("Spy ID " + this.spyID + " has been detected and eliminated");
        spyCount--;
        System.out.println("Spy count: " + spyCount);
    }

}