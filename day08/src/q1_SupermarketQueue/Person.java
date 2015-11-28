package q1_SupermarketQueue;

/**
 * a node (a person) in a singly-linked list of people
 */

public class Person {

    private String name;
    private int age;
    private Person nextPerson;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        nextPerson = null;
    }

    public Person() {
        nextPerson = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() { return age; }

    public Person getNextPerson() {
        return nextPerson;
    }

    public void setNextPerson(Person person) {
        nextPerson = person;
    }
}	