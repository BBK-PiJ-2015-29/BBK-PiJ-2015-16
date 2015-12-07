public class TestAL {
    public static void main(String[] args) {
        List al = new ArrayList();
        // ...
        al.add("ajshdjahsd");
        ReturnObject ro = al.get(0);

        if (ro.hasError()){
            System.out.println(ro.getError());
        } else {
            System.out.println(ro.getReturnValue());
        }
    }
}
