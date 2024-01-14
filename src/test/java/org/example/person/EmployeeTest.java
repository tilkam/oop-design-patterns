package org.example.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void createEmployee() {
        Person person = new Person("John", "john@email.xom");
        Employee employee = new Employee(person.getName(), "ICC", new Role("Developer"));

        assertEquals(1, employee.getRoles().size());
        assertEquals("Developer", employee.getRoles().get(0).name());
    }

    @Test
    void addRole() {
        Employee employee = new Employee("John", "ICC", new Role("Developer"));
        employee.addRole(new Role("Manager"));

        assertEquals(2, employee.getRoles().size());
        assertEquals("Manager", employee.getRoles().get(1).name());
    }
}