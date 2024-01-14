package org.example.data;

import org.example.utils.Storage;
import org.example.person.Person;

import java.util.LinkedList;
import java.util.List;

public class PopulatePeople {
    static List<Person> people;

    public static void addPeople() {
        people = new LinkedList<>();
        people.add(new Person("John", "john@email.com"));
        people.add(new Person("Sven", "sven@email.com"));
        people.add(new Person("Anna", "anna@email.com"));
        people.add(new Person("Mary", "mary@email.com"));
        Storage.save(people);
    }
}
