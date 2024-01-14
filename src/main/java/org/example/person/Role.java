package org.example.person;

public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
