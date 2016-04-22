package q1_SupermarketQueue;

public class Supermarket {

    private PersonQueue queue;

    public Supermarket() {
        queue = new PersonQueueImpl();
    }

    public void addPerson(Person newPerson) {
        queue.insert(newPerson);
    }

    public Person servePerson() {
        return queue.retrieve();
    }
}



