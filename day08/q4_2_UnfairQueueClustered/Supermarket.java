package q4_2_UnfairQueueClustered;

public class Supermarket {

    private PersonQueue queue1;
    private PersonQueue queue2;
    private PersonQueue queue3;

    public Supermarket() {
        queue3 = new UnfairQueue();
    }

    public void addPerson(Person newPerson) {
        queue3.insert(newPerson);
    }

    public Person servePerson() {
        Person next = queue3.retrieve();
        return next;
    }
}



