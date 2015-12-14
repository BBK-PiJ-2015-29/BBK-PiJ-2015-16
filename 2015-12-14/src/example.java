// IPerson -> Person = the way Microsoft does it

interface Person {
}

interface Academic extends Person {
}

interface Student extends Person {
}

interface TeachingAssistant extends Academic, Student {
    void myMeth();
}

/**
 * Person
 * Academic               Student
 * Teaching Assistant
 */


public class example {
    public static void main(String[] args) {
        Person[] persons = new Person[10];
        TeachingAssistant ta = new TeachingAssistantImpl();
        ta.myMeth();

        Academic a = new AcademicImpl();

        persons[0] = ta;
        persons[1] = a;

        for (int i = 0; i < persons.length; i++)
            System.out.println(persons[i]);
    }
}

abstract class PersonImpl implements Person {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class AcademicImpl extends PersonImpl implements Academic {

}

class StudentImpl extends PersonImpl implements Student {
}

class TeachingAssistantImpl implements TeachingAssistant { // perhaps extend AcademicImpl or extend StudentImpl
    // composition
    private Academic ac = new AcademicImpl();
    private Student st = new StudentImpl();

    // ...

    @Override
    public void myMeth() {
        //
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
