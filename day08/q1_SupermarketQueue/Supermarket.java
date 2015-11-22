package q1_SupermarketQueue;

public class Supermarket {

	private PersonQueue queue1;
	private PersonQueue queue2;
	private PersonQueue queue3;

	public Supermarket() {
		queue1 = new SupermarketQueue();
	}
	
	public void addPerson(Person newPerson) {
		queue1.insert(newPerson);
	}
	
 	public Person servePerson() {
 		Person next = queue1.retrieve();
		return next;
	}
}



