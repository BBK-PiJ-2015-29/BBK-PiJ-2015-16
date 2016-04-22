package q4_2_queuetests.q1;

public class SupermarketQueue implements PersonQueue {

    private Person firstPerson;

    public SupermarketQueue() {
        firstPerson = new Person();
    }

    @Override
    public void insert(Person insertPerson) {
        if (firstPerson.getNextPerson() == null) {
            firstPerson.setNextPerson(insertPerson);
        } else {
            insertPerson.setNextPerson(firstPerson.getNextPerson());
            firstPerson.setNextPerson(insertPerson);
        }
        System.out.println(insertPerson.getName() + " joined the queue");
    }

    @Override
    public Person retrieve() {
        Person result;
        Person currentPerson = firstPerson;
        if (currentPerson.getNextPerson() == null) {
            result = new Person("EMPTY", 0);
            System.out.println("QUEUE IS EMPTY");
            return result;
        }
        while (currentPerson.getNextPerson().getNextPerson() != null) {
            currentPerson = currentPerson.getNextPerson();
        }
        result = currentPerson.getNextPerson();
        currentPerson.setNextPerson(null);
        return result;
    }
}