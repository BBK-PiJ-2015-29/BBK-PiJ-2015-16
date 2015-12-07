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
public class DemoSerializationWithResources {

    public static void main(String[] args) {
        final String FILENAME = "demo.ser";

        List<Person> lp = new ArrayList<>();
        Person p = new Person("Freddie");

        lp.add(p);
        p = new Person("Joe");
        lp.add(p);

        System.out.println("Before: " + lp);

        try (ObjectOutputStream
                     encode = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(FILENAME)));) {

            encode.writeObject(lp);
        } catch (IOException ex) {
            System.err.println("Ouch: " + ex);
        }


        // now turn it back into an object

        try (ObjectInputStream
                     d = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(FILENAME)));) {
            List<Person> result = null;
            result = (List<Person>) d.readObject();

            System.out.println("After: " + result);

        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("On write error " + ex);
        }
    }
}

