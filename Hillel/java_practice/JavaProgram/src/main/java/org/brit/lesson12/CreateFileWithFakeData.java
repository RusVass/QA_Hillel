package org.brit.lesson12;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class CreateFileWithFakeData {
    public static void main(String[] args) throws IOException {

        File file = new File( "Students.csv");
// якщо є файл у папці ми його видалямо
        if (file.exists()){
            file.delete();
        }
      // формуємоє  фейкові дані
        Faker faker = new Faker();

// формуємо стрічку яку будемо записувать і записуємо у файл
        for (int i = 1; i <=10; i++){
            String fistName = faker.name().firstName();
            String lastName = faker.name().lastName();
            Integer age = faker.number().numberBetween(25,30);

            String str = String.join(",",
                    Integer.toString(i),
                    fistName,
                    lastName,
                    age.toString())+ "\n";
            FileUtils.writeStringToFile(file, str, Charset.defaultCharset(),true);


        }

    }
}
