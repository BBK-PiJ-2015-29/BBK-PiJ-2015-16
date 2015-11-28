package q8stacks;

public class StackElement {

    private int storeNumber;
    private StackElement nextNode;

    public StackElement(int storeNumber) {
        this.storeNumber = storeNumber;
        this.nextNode = null;
    }

    public StackElement() {
        this.nextNode = null;
    }

    public void push(StackElement newNode) {
        //	printStack();
        System.out.println("Pushing " + newNode.storeNumber + "...");
        newNode.nextNode = this.nextNode;
        this.nextNode = newNode;
        int temp = this.storeNumber;
        this.storeNumber = newNode.storeNumber;
        newNode.storeNumber = temp;
    }

    public void pop() {
        //	printStack();
        if (empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popping...it's a " + this.storeNumber);
            this.storeNumber = this.nextNode.storeNumber;
            this.nextNode = this.nextNode.nextNode;
        }
    }

    public boolean empty() {
        return this.nextNode == null;
    }

	public int size() {
		StackElement currentNode = this;
		int result = 0;
		while (currentNode.nextNode != null) { 
			result++;
			currentNode = currentNode.nextNode;
		} 			
		return result;
	}
	
	public void printStack(){
		StackElement currentNode = this;
		System.out.print("Stack size: " + this.size() + " Contains: ");
		while (currentNode.nextNode != null) { 
			System.out.print(currentNode.storeNumber + ", ");
			currentNode = currentNode.nextNode;
		}
		System.out.println(); 			
	}
}
	