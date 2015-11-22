package q4_2_UnfairQueueClustered;

public class SupermarketTest {

	public static void main (String[] args) {
		SupermarketTest script = new SupermarketTest();
		script.launch();
	}
	
	public void launch() {
	
		Supermarket tesco = new Supermarket();
		Person mk = new Person("Mak", 19);
		tesco.addPerson(mk);	
		Person ck = new Person("Cat", 13);
		tesco.addPerson(ck);
		Person tk = new Person("Tommy", 66);
		tesco.addPerson(tk);
		Person jk = new Person("Jon", 99);
		tesco.addPerson(jk);
		Person ak = new Person("Anne", 58);
		tesco.addPerson(ak);
		Person bk = new Person("Brett", 11);
		tesco.addPerson(bk);
		Person ek = new Person("Elsie", 57);
		tesco.addPerson(ek);
		Person dk = new Person("Dot", 68);
		tesco.addPerson(dk);
		Person toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
	}
}	
	