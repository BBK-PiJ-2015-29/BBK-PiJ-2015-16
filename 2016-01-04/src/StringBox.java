public class StringBox {
    private String i;

    public StringBox(String i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "The value is " + i;
    }
}
