public class PersonImpl implements Person {

    private int yearOfBirth;
    private String name;

    public PersonImpl(int yob, String name) {
        yearOfBirth = yob;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int compareTo(Person other) {
        return this.getYearOfBirth() - other.getYearOfBirth();
    }

    @Override
    public String toString() {
        return name;
    }
}
