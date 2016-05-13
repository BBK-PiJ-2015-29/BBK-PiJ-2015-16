package java8.lambda;

import java.util.List;

public class RoboCallTest03 {

    public static void main(String[] args) {

        List<Person> pl = Person.createShortList();
        RoboContactAnon robo = new RoboContactAnon();

        System.out.println("\n==== Test 03 ====");
        System.out.println("\n=== Calling all Drivers ===");
        robo.phoneContacts(pl,
                p -> p.getAge() >= 16
        );

        System.out.println("\n=== Emailing all Draftees ===");
        robo.emailContacts(pl,
                p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE
        );


        System.out.println("\n=== Mail all Pilots ===");
        robo.mailContacts(pl,
                p -> p.getAge() >= 23 && p.getAge() <= 65
        );
    }
}