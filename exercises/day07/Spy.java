public class Spy {
    private static int spyCount = 0;
    private int spyId;

    public Spy(int spyId) {
        spyCount++;
        this.spyId = spyId;
        System.out.println("This spy has ID " + spyId);
        System.out.println("Spy count: " + getSpyCount());
    }

    public static int getSpyCount() {
        return spyCount;
    }

    public static void main(String[] args) {
        Spy bond = new Spy(7);
        Spy alan = new Spy(1);
        Spy sarah = new Spy(3);
        Spy john = new Spy(5);
        Spy mary = new Spy(6);
        bond.die();
        mary.die();
    }

    public void die() {
        System.out.println("Spy " + spyId + " has been detected and eliminated.");
        spyCount--;
        System.out.println("Spy count: " + getSpyCount());
    }

}

