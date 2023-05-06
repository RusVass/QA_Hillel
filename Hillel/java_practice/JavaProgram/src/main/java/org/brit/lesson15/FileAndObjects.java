package org.brit.lesson15;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileAndObjects {

public static void main(String[] args) throws IOException {
      Map<Integer, Student> integerStudentMap =  readFileWithStudents();
      integerStudentMap.entrySet().forEach(System.out::println);

        System.out.println();

for (Map.Entry<Integer,Student> entry :integerStudentMap.entrySet()){

Student student = entry.getValue();
// виводить конкректно студентів згідно віку
if (student.getAge()> 45){
// те саме  виводить всіх студентів згідно віку
//  if (entry.getValue().getAge()> 1){
 System.out.println(entry.getKey()+"==>"+ entry.getValue());

}

}
Student student = new Student();

}

public static Map<Integer, Student> readFileWithStudents() throws IOException {
    File file = new File("Students.csv");
    List<String> list = FileUtils.readLines(file, Charset.defaultCharset());
    Map<Integer, Student> result = new HashMap<>();

    for (String line : list.subList(1,list.size())) {
        String[] split = line.split(",");
        Integer id = Integer.parseInt(split[0]);
        String name = split[1];
        String lastName = split[2];
        Integer age = Integer.parseInt(split[3]);
        String group = split [4];
        Student student = new Student(name,lastName,age,group);
        result.put(id,student);

}

 return result;
}




}
