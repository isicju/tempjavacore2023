package org.example;

public class User {
    int id;
    String name;
    public int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User(int someId, String someName){
        id = someId;
        name = someName;
    }

}
