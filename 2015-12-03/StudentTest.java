public class StudentTest {
    public static void main(String... args) {
        for (String s : args){
            System.out.println(s);
        }

        Student st = new StudentImpl();
        st.setAge(34);
        st.setName("Fred");
        System.out.println(st.toString());
    }
}
