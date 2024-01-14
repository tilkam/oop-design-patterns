package org.example.person;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 3487495895819393L;
    private final String name;
    private String email;
    private String phone;

    public Person(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be null or empty");
        }
        this.name = name;

    }
    public Person(String name, String email) {
        this(name);
        this.email = email;
    }
    public Person(String name, String email, String phone) {
        this(name);
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return String.format("%s - %s  %s", name, (email==null?"":email), (phone==null?"":phone));
    }
}

