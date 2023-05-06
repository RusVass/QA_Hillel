package org.brit.lesson12;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadCSV {
    public static void main(String[] args) throws IOException {
        File file = new File("Students.csv");

        List<String> list = FileUtils.readLines(file, Charset.defaultCharset());
        list.forEach(System.out::println);

        Map<Integer, Map<String, Object>> users = new HashMap<>();

        for (String line : list) {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[0]);
            String firstName = split[1].trim();
            String lastName = split[2].trim();
            Integer age = Integer.parseInt(split[3]);

            Map<String, Object> user = new HashMap<>();
            user.put("firstName", firstName);
            user.put("lastName", lastName);
            user.put("age", age);

            users.put(id, user);
        }

// вивести красиво в табличку
      for (Map.Entry<Integer, Map<String, Object>> entry : users.entrySet()) {
            System.out.println("ID:" + entry.getKey() + "==>\n");
            for (Map.Entry<String, Object> entry1 : entry.getValue().entrySet()) {
                System.out.println(entry1.getKey() + ": " + entry1.getValue());
           }
       }
        System.out.println();


//// вводимо юзерів <= 40
        for (Map.Entry<Integer, Map<String, Object>> entry : users.entrySet()){
           if (((Integer) entry.getValue().get("age")) <= 40) {
                System.out.println(entry.getKey() + "==>");
                printMap(entry.getValue());
            }
        }

////// виводимо юзерів які починаються на "М"
        for (Map.Entry<Integer, Map<String, Object>> entry : users.entrySet()){
        if (entry.getValue().get("firstName").toString().startsWith("M")) {
            System.out.println(entry.getKey() + "==>");
            printMap(entry.getValue());

            }
        }
    }
        public static void printMap (Map < String, Object > user){
            for (Map.Entry<String, Object> entry : user.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
            System.out.println();
       }


    }

