package myabstract;

public abstract class MyAbstract implements MySomethingElseInterface {
    private String thing;

    public void ouch(){
        System.out.println("Ouch!");
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }
}
