package q4_1_UnfairQueueSimple;

public class SupermarketTest {

    public static void main(String[] args) {
        SupermarketTest script = new SupermarketTest();
        script.launch();
    }

    public void launch() {

        Supermarket tesco = new Supermarket();
        Person mk = new Person("Mak", 10);
        tesco.addPerson(mk);
        Person toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
        Person ck = new Person("Cat", 9);
        tesco.addPerson(ck);
        Person tk = new Person("Tommy", 16);
        tesco.addPerson(tk);
        Person jk = new Person("Jon", 7);
        tesco.addPerson(jk);
        toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
        toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
        toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
        toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
        Person ak = new Person("Anna", 99);
        tesco.addPerson(ak);
        Person ek = new Person("Ellie", 16);
        tesco.addPerson(ek);
        Person dk = new Person("Dot", 56);
        tesco.addPerson(dk);
        toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
        toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
        toServe = tesco.servePerson();
        System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
    }
}	
