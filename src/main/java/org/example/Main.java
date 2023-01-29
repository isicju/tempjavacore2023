package org.example;


import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//static
    public static void main(String[] args) {
        User peterUser = new User(12, "Peter");
        User john = new User(13, "Peter");
        User john3 = new User(13, "Peter");


        john.age = 13;
        System.out.println("Peter age: "+ peterUser.age);



    }

    private static void printMe(User user){


    }


}