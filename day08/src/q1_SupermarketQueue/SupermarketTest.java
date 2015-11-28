package q1_SupermarketQueue;

public class SupermarketTest {

    public static void main(String[] args) {
        SupermarketTest script = new SupermarketTest();
        script.launch();
    }

    public void launch() {
        Supermarket tesco = new Supermarket();
        Person mk = new Person("Mac", 10);
        tesco.addPerson(mk);
        Person toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        Person ck = new Person("Cat", 90);
        tesco.addPerson(ck);
        Person tk = new Person("Tommy", 16);
        tesco.addPerson(tk);
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        Person ak = new Person("Anna", 90);
        tesco.addPerson(ak);
        Person ek = new Person("James", 16);
        tesco.addPerson(ek);
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
    }
}	
