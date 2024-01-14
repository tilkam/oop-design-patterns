package org.example.person;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        addRole(initialRole);
    }

    public void addRole(Role initialRole) {
        roles.add(initialRole);
    }

    public void removeRole(String role) {
        if(roles.stream().anyMatch(r -> r.name().equals(role))) {
            roles.removeIf(r -> r.name().equals(role));
        } else {
            System.out.println("Role not found");
        }
    }
    public void removeRole(Role role) {
        if(roles.contains(role)) {
            roles.remove(role);
        } else {
            System.out.println("Role not found");
        }
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return String.format("%s - %s, roles: %s", name, department, roles);
    }
}
