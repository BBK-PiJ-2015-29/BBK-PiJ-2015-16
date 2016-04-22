package q7b;

public class SelfSortingList {

	private Node head;

	
	public SelfSortingList () {
		head = new Node();
	}	
	
	public Node getHead() {
		return head;
	}
			
	public void add(int item) {
		if(head.getNextNode() == null) {
			Node newNode = new Node(item);
			head.setNextNode(newNode);
			return;
		}	
		if(head.getNextNode().getItem() > item) {
			Node newNode = new Node(item);
			newNode.setNextNode(head.getNextNode());
			head.setNextNode(newNode);
			return;
		}
		Node newNode = new Node(item);
		Runnable r = new AddRunnable(this, newNode);
		Thread t = new Thread(r);
		t.start();
	}
	
	public void printList() {
		Node runner;
		if(head.getNextNode() != null) {
			runner = head.getNextNode();
		} else {
			System.out.println("List is empty");
			return;
		}	
		while(runner.getNextNode() !=null) {
			System.out.print(runner.getItem() + " < ");
			runner = runner.getNextNode();	
		}
		System.out.println(runner.getItem());
	}

}

// NODE
class Node {

	private int item;	
	private Node nextNode;
	
	public Node() {
		this.nextNode = null;
	}
	
	public Node (int item) {
		this.item = item;
		this.nextNode = null;
	}
	
	public void setItem(int item) {
		this.item = item;
	}	
		
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}	
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public int getItem() {
		return item;
	}	
	
	
}	