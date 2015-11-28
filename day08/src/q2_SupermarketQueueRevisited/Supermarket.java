package q2_SupermarketQueueRevisited;

public class Supermarket {

    private PersonQueue q1;
    private PersonQueue q2;
    private PersonQueue q3;

    public Supermarket() {
        q2 = new TakeNumberQueue();
    }

    public void addPerson(Person newPerson) {
        q2.insert(newPerson);
    }

    public Person servePerson() {
        Person next = q2.retrieve();
        return next;
    }
}



