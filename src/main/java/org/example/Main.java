package org.example;

import org.example.data.PopulatePeople;
import org.example.person.Employee;
import org.example.person.Person;
import org.example.person.Role;
import org.example.utils.Storage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PopulatePeople.addPeople();
        List<Person> persons = Storage.fetchPersons();

        assert persons != null;
        persons.forEach(System.out::println);
        Employee employee = new Employee(persons.get(0).getName(), "ICC", new Role("Developer"));
        System.out.println(employee);

        Role architect = new Role("Architect");
        employee.addRole(new Role("Manager"));
        System.out.println(employee);

        employee.removeRole("Manager");
        employee.addRole(architect);
        System.out.println(employee);
    }
}