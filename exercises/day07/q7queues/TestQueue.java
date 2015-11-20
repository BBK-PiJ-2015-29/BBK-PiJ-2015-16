package q7queues;

public class TestQueue {

    private Node numQStart = new Node();


    public static void main(String[] args) {
        TestQueue numQ = new TestQueue();
        numQ.launch();
    }

    private void launch() {

        //There are 0 requests in the queue
        int qSize = numQStart.size();
        System.out.println("There are " + qSize + " requests in the queue");
        // Inserting request 5...
        Node firstRequest = new Node(5);
        numQStart.insert(firstRequest);
        // Inserting request 8...
        Node secondRequest = new Node(8);
        numQStart.insert(secondRequest);
        // Inserting request 12...
        Node thirdRequest = new Node(12);
        numQStart.insert(thirdRequest);
        //There are 3 requests in the queue
        System.out.println("There are " + numQStart.size() + " requests in the queue");
        //Retrieving oldest request (which is 5)...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");
        //There are 2 requests in the queue
        System.out.println("There are " + numQStart.size() + " requests in the queue");
        // Inserting request 14...
        Node fifthRequest = new Node(14);
        numQStart.insert(fifthRequest);
        // Inserting request 16...
        Node sixthRequest = new Node(16);
        numQStart.insert(sixthRequest);
        // Inserting request 18...
        Node seventhRequest = new Node(18);
        numQStart.insert(seventhRequest);
        //There are 5 requests in the queue
        System.out.println("There are " + numQStart.size() + " requests in the queue");
        //Retrieving oldest request (which is 8)...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");
        //There are 4 requests in the queue
        System.out.println("There are " + numQStart.size() + " requests in the queue");
        //Retrieving oldest request (which is 12)...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");
        //Retrieving oldest request (which is 14)...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");
        //Retrieving oldest request (which is 16)...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");

        //There are 1 requests in the queue
        System.out.println("There are " + numQStart.size() + " requests in the queue");
        //Retrieving oldest request (which is 18)...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");

        //There are 0 requests in the queue
        System.out.println("There are " + numQStart.size() + " requests in the queue");
        //try and request against an empty queue...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");
        //And now add to queue again...
        // Inserting request 20...
        Node aRequest = new Node(20);
        numQStart.insert(aRequest);
        // Inserting request 22...
        Node bRequest = new Node(22);
        numQStart.insert(bRequest);
        // Inserting request 24...
        Node cRequest = new Node(24);
        numQStart.insert(cRequest);
        //Retrieving oldest request (which is 18)...
        System.out.println("Retrieving request " + numQStart.retrieve() + "...");
        //There are 2 requests in the queue
        System.out.println("There are " + numQStart.size() + " requests in the queue");
    }
}