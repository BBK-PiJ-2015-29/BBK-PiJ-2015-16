package xmlserialization;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This example class demonstrates how to write and read objects to an XML file
 */
public class DemoXMLSerialization {

    public static void main(String[] args) {
        final String FILENAME = "demo.xml";

        List<Person> lp = new ArrayList<>();
        Person p = new Person("Freddie");
        System.out.println("Before: " + p);
        lp.add(p);
        p = new Person("Joe");
        lp.add(p);

        XMLEncoder encode = null;
        try {
            encode = new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream(FILENAME)));
        } catch (FileNotFoundException e) {
            System.err.println("encoding... " + e);
        }

        encode.writeObject(lp);
        encode.close();

        // now read the file and display it

        Scanner sc = null;

        try {
            sc = new Scanner(
                    new BufferedInputStream(
                            new FileInputStream(FILENAME)));
        } catch (FileNotFoundException e) {
            System.err.println("reading... " + e);
        }

        while (sc.hasNext())
            System.out.println(sc.next());

        sc.close();

        // now turn it back into an object

        XMLDecoder d = null;
        try {
            d = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(FILENAME)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Person> result = (List<Person>) d.readObject();

        System.out.println("After: " + result);
        d.close();
    }
}

