package q2_SupermarketQueueRevisited;

public class TakeNumberQueue implements PersonQueue {

    private Person[] personArray;

    public TakeNumberQueue() {
        personArray = new Person[4];
        for (int i = 0; i < 4; i++) {
            personArray[i] = new Person();
        }
    }

    /**
     * Adds another person to the queue
     */
    @Override
    public void insert(Person person) {
        boolean done = false;
        int i = 0;
        while (i < personArray.length - 1 && !done) {
            if (personArray[i].getName() == null) {
                personArray[i] = person;
                done = true;
            } else {
                i++;
            }
        }
        if (!done) {
            System.out.println("queue full - " + person.getName() + " not added");
        }
    }

    /**
     * Removes a person from the queue
     */
    @Override
    public Person retrieve() {
        int i = 0;
        boolean done = false;
        Person result = personArray[0];
        while (personArray[i].getName() != null && i < personArray.length - 1) {
            personArray[i] = personArray[i + 1];
            i++;
        }

        if (result.getName() == null) {
            result = new Person("EMPTY", 0);
            System.out.print("QUEUE IS EMPTY...");
        }
        return result;
    }
}







