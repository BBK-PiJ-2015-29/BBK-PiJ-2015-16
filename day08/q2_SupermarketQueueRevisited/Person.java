package q2_SupermarketQueueRevisited;

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
        this.nextPerson = null;
    }

    public Person() {
        this.nextPerson = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getNextPerson() {
        return nextPerson;
    }

    public void setNextPerson(Person person) {
        this.nextPerson = person;
    }
}	