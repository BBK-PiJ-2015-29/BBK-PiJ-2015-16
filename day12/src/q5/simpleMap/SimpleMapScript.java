package q5.simpleMap;

public class SimpleMapScript {
    public static void main(String[] args) {
        SimpleMapScript sms = new SimpleMapScript();
        sms.launch();
    }

    public void launch() {
        SimpleMapImpl smi = new SimpleMapImpl();

        //add names
        boolean quit = false;
        String name;
        int hash, smallHash;
        System.out.println("Enter name (q for quit): ");
        while (!quit) {
            System.out.print("> ");
            name = System.console().readLine();
            if (!name.equals("q")) {
                hash = name.hashCode();
                smallHash = HashUtilities.shortHash(hash);
                smi.put(smallHash, name);
            } else {
                quit = true;
            }
        }
        //get names
        quit = false;
        String key;
        int intKey;
        System.out.println("Get items by key (q for quit)");
        while (!quit) {
            System.out.print("> ");
            key = System.console().readLine();
            if (!key.equals("q")) {
                intKey = Integer.parseInt(key);
                System.out.println("Got: " + smi.get(intKey));
            } else {
                quit = true;
            }
        }
        //remove names
        quit = false;
        System.out.println("Remove items by key (q for quit)");
        while (!quit) {
            System.out.print("> ");
            key = System.console().readLine();
            if (!key.equals("q")) {
                intKey = Integer.parseInt(key);
                System.out.println("Removing: " + smi.get(intKey));
                smi.remove(intKey);
                System.out.println("Check " + key + " is " + smi.get(intKey));
                //check if map is empty
                System.out.print("the map is ");
                if (smi.isEmpty()) {
                    System.out.println("empty");
                    quit = true;
                } else {
                    System.out.println("not empty");
                }
            } else {
                quit = true;
            }
        }
        System.out.println();
    }
}