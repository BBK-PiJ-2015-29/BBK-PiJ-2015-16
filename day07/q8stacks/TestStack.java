package q8stacks;

public class TestStack {

    private StackElement stackStart = new StackElement();

    public static void main(String[] args) {
        TestStack myStack = new TestStack();
        myStack.launch();
    }

    private void launch() {
        // push 5...
        StackElement firstPush = new StackElement(5);
        stackStart.push(firstPush);

        // push 8...
        StackElement bPush = new StackElement(8);
        stackStart.push(bPush);

        // push 12...
        StackElement cPush = new StackElement(12);
        stackStart.push(cPush);

        // pop (and get... 12)
        stackStart.pop();

        // push 13
        StackElement dPush = new StackElement(13);
        stackStart.push(dPush);

        // pop (and get... 13)
        stackStart.pop();

        // pop (and get... 8)
        stackStart.pop();

        // pop (and get... 5)
        stackStart.pop();

        // pop (and get... Stack Empty)
        stackStart.pop();

        // pop (and get... Stack Empty)
		stackStart.pop(); 

        // put two 8s on
        StackElement ePush = new StackElement(8);
		stackStart.push(ePush);
		StackElement fPush = new StackElement(8);
		stackStart.push(fPush);

        //pop one 8
		stackStart.pop(); 

        // put two 13s on
		StackElement gPush = new StackElement(13);
		stackStart.push(gPush);
		StackElement hPush = new StackElement(13);
		stackStart.push(hPush);

        // pop the last 8
		stackStart.pop(); 

        //and then the last 2 13s and get a final two empty
		stackStart.pop(); 		
		stackStart.pop(); 		
		stackStart.pop(); 
		stackStart.pop(); 
    }
}