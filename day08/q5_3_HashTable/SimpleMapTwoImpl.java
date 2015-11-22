package q5_3_HashTable;

public class SimpleMapTwoImpl implements SimpleMapTwo {

    private Person[] hashTable;

    public SimpleMapTwoImpl() {
        hashTable = new Person[10];
        for (int i = 0; i < 10; i++) {
            hashTable[i] = new Person();
        }
    }

    @Override
    public String put(int key, String name) {
        Person currentPerson = new Person();
        currentPerson = hashTable[key];
        boolean done = false;
        while (!done) {
            if (currentPerson.getNextPerson() == null) {
                Person insertPerson = new Person();
                insertPerson.setName(name);
                currentPerson.setNextPerson(insertPerson);
                done = true;
            } else {
                currentPerson = currentPerson.getNextPerson();
            }
        }
        return "";
    }

    @Override
    public String[] get(int key) {
        Person currentPerson = new Person();
        currentPerson = hashTable[key];
        int i = 0;
        boolean done = false;
        while (!done) {
            if (currentPerson.getNextPerson() == null) {
                done = true;
            } else {
                i++;
                currentPerson = currentPerson.getNextPerson();
            }
        }
        String[] result;
        result = new String[i];
        currentPerson = hashTable[key];
        i = 0;
        done = false;
        while (!done) {
            if (currentPerson.getNextPerson() != null) {
                result[i] = currentPerson.getNextPerson().getName();
                i++;
                currentPerson = currentPerson.getNextPerson();
            } else {
                done = true;
            }
        }
        return result;
    }


    @Override
    public void remove(int key, String name) {
        Person currentPerson = new Person();
        currentPerson = hashTable[key];
        boolean done = false;
        while (currentPerson.getNextPerson() != null && !done) {
            if (currentPerson.getNextPerson().getName().equals(name)) {

                currentPerson.getNextPerson().setName(null);

                if (currentPerson.getNextPerson() != null) {
                    currentPerson.setNextPerson(currentPerson.
                            getNextPerson().getNextPerson());
                }

                done = true;

            } else {
                currentPerson = currentPerson.getNextPerson();
            }


        }
        if (!done) {
            System.out.println(name + " is not in the hash table.");
        } else {
            System.out.println("Removal done successfully");
        }
    }

    @Override
    public boolean isEmpty() {
        Person currentPerson = new Person();
        for (int i = 0; i < 10; i++) {
            currentPerson = hashTable[i];
            if (currentPerson.getNextPerson() != null) {
                return false;
            }
        }
        return true;
    }
}