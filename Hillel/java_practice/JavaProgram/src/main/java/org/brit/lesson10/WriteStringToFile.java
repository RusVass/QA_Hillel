package org.brit.lesson10;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;

public class WriteStringToFile {
    public static void main(String[] args) throws IOException {

        String str = "Hello \n World!!!";// цей запис зписуємо у файл

        File file = new File("text1.txt");
       // Writer
//    writeWithBufferWriter(file, str, false);
//    writeWithBufferWriter(file, str, true);
//    writeWithBufferWriter(file, str, false);

        // FileUtils
//     writeToFileWithFileUtils(file, str, false);
//     writeToFileWithFileUtils(file, str, true);
//     writeToFileWithFileUtils(file, str, false);

        // Files
       writeToFileWithFiles(file,str, false);
        writeToFileWithFiles(file,str,true );
        writeToFileWithFiles(file,str, false);
    }
// Writer -  тобто створює файл + записує +дописує и переписує
    // записати в файл text1.txt инфу "Hello \n World!!!"
public static void writeWithBufferWriter(File file,String str, boolean append) throws IOException {
    FileWriter fileWriter = new FileWriter(file, append);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    for (Character ch: str.toCharArray()){
        bufferedWriter.append(ch);
    }
    bufferedWriter.flush();// здампити на диск
    bufferedWriter.close();

}
// FileUtils  - тобто створює файл + записує +дописує и переписує
    // ссилка для встановленння Utils версії в папку  pom.xml для того щоб Util працюва
    // https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0

public static void writeToFileWithFileUtils(File file, String str, boolean append) throws IOException {
    FileUtils.writeStringToFile(file, str, Charset.defaultCharset(),append );
}

// Files - тобто створює файл +
// записує +дописує и переписує (не працює правильно)
public  static  void  writeToFileWithFiles(File file, String str, boolean append) throws IOException {
    StandardOpenOption standardOpenOption;
    if (append) {
        standardOpenOption = StandardOpenOption.APPEND;
    } else {
        standardOpenOption = StandardOpenOption.CREATE;
    }
    Files.writeString(file.toPath(), str, standardOpenOption);

    }
}



