public class StudentImpl implements Student {
    private String name;
    private int age;

    public StudentImpl(String name, int age) {
        setName(name);
        setAge(age);
    }

    public StudentImpl() {
        this("", 0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name " + getName() + " age " + getAge();
    }
}
