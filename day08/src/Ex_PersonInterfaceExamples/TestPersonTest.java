package Ex_PersonInterfaceExamples;

public class TestPersonTest {

    public static void main(String[] args) {
        TestPersonTest tps = new TestPersonTest();
        tps.launch();
    }


    public void launch() {

        Person firstPerson = new AdultPerson();
        testPerson(firstPerson);
        Person secondPerson = new KidPerson();
        testPerson(secondPerson);
    }

    private void testPerson(Person person) {

        System.out.println("Testing a person");
        person.move(10);
        person.say("Hello!");
    }

}	

	
	
	
		