package org.example.utils;

import org.example.person.Person;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Storage {
    private final static String FILE = "persons.bin";

    @SuppressWarnings("unchecked")
    public static List<Person> fetchPersons() {
        File f = new File(FILE);
        LinkedList<Person> list = null;
        try {
            if (!f.exists()) {
                System.out.println("INFO: Can't find " + FILE);
                return null;
            }
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream
                            (FILE));
            list = (LinkedList<Person>) in.readObject();
            in.close();
        } catch (Exception e) {
            System.err.println("Could not load address book from " + FILE);
        }
        return list;
    }

    public static void save(List<Person> list) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE));
            out.writeObject(list);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
