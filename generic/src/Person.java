public interface Person extends Comparable<Person> {
    String getName();

    int getYearOfBirth();

    @Override
    int compareTo(Person other);

    @Override
    String toString();
}
