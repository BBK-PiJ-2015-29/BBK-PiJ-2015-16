package q2_SupermarketQueueRevisited;

public class SupermarketTest {

    public static void main(String[] args) {
        SupermarketTest script = new SupermarketTest();
        script.launch();
    }

    public void launch() {

        Supermarket tesco = new Supermarket();
        System.out.println("adding mark");
        Person mk = new Person("Mak", 10);
        tesco.addPerson(mk);

        System.out.println("serve 1 person now...");


        Person toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());

        System.out.println("adding cathy and tom");
        Person ck = new Person("Cat", 90);
        tesco.addPerson(ck);
        Person tk = new Person("Tommy", 16);
        tesco.addPerson(tk);

        System.out.println("serve 3 people now...");

        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());

        System.out.println("adding anna, ellie, jack and peter");
        Person ak = new Person("Anna", 90);
        tesco.addPerson(ak);
        Person ek = new Person("Ellie", 16);
        tesco.addPerson(ek);
        Person jk = new Person("John", 90);
        tesco.addPerson(jk);
        Person pk = new Person("Pete", 16);
        tesco.addPerson(pk);

        System.out.println("serve 4 people now...");

        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());
        toServe = tesco.servePerson();
        System.out.println("Serving: " + toServe.getName());

    }
}	
