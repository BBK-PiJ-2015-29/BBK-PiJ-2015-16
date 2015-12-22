package xmlserialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * This example class demonstrates how to write and read objects to a file
 */
@SuppressWarnings("unchecked")
public class DemoSerializationWithResources {

    public static void main(String[] args) {
        final String FILENAME = "demo.ser";

        List<Person> lp = new ArrayList<>();
        List<Person> lp2  = new ArrayList<>();

        Person p = new Person("Freddie");

        lp.add(p);
        p = new Person("Joe");
        lp.add(p);

        lp2.add(new Person("Fiona"));

        System.out.println("Before: " + lp);
        System.out.println("Before: " + lp2 + "\n");

        try (ObjectOutputStream
                     encode = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(FILENAME)));) {

            encode.writeObject(lp);
            encode.writeObject(lp2);
            encode.writeObject(new Person("Barney"));
        } catch (IOException ex) {
            System.err.println("Ouch: " + ex);
        }

        // now turn it back into an object
        List<Person> result1 = null;
        List<Person> result2 = null;


        try (ObjectInputStream
                     d = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(FILENAME)));) {
            result1 = (List<Person>) d.readObject();
            result2 = (List<Person>) d.readObject();
            Person person = (Person) d.readObject();

            System.out.println("After: " + result1);
            System.out.println("After: " + result2);
            System.out.println("After: " + person);


        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("On write error " + ex);
        }
    }
}

