package org.example;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);

        System.out.println(MathLib.makeSum(1,2));

        String result = FileUtils.readFileToString(file, StandardCharsets.UTF_8);


        System.out.println(result);
    }

}