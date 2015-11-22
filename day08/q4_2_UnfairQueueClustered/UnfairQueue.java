package q4_2_UnfairQueueClustered;

public class UnfairQueue implements PersonQueue {

    private Person firstPerson = new Person();

    @Override
    public void insert(Person insertPerson) {
        if (firstPerson.getNextPerson() == null) {
            firstPerson.setNextPerson(insertPerson);
        } else {
            insertPerson.setNextPerson(firstPerson.getNextPerson());
            firstPerson.setNextPerson(insertPerson);
        }
        System.out.println("+ " + insertPerson.getName() + " " + insertPerson.getAge());
    }

    @Override
    public Person retrieve() {
        Person result;
        Person currentPerson = firstPerson;
        if (currentPerson.getNextPerson() == null) {
            result = new Person("EMPTY", 0);
            System.out.print("QUEUE IS EMPTY - ");
            return result;
        }
        result = firstPerson.getNextPerson();
        currentPerson = result;
        boolean done = false;
        while (currentPerson != null) {
            if (currentPerson.getAge() > 65) {
                result = currentPerson;
                done = true;
            }
            currentPerson = currentPerson.getNextPerson();
        }
        currentPerson = firstPerson;
        if (!done) {
            while (currentPerson != null) {
                if (currentPerson.getAge() > 18) {
                    result = currentPerson;
                    done = true;
                }
                currentPerson = currentPerson.getNextPerson();
            }
        }
        currentPerson = firstPerson;
        if (!done) {
            while (currentPerson != null) {
                result = currentPerson;
                currentPerson = currentPerson.getNextPerson();
            }
        }


        currentPerson = firstPerson;
        done = false;
        while (!done && !currentPerson.getNextPerson().equals(null)) {
            if (!currentPerson.getNextPerson().equals(result)) {
                currentPerson = currentPerson.getNextPerson();
            } else {
                //next person is result
                currentPerson.setNextPerson(result.getNextPerson());
                done = true;
            }
        }
        return result;
    }
}