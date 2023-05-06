package org.brit.lesson10;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadFileToString {

    //BufferedReader - прочитати файли, робота по символьно аба по байтово
    //Scanner - прочитати файл
    //FileUtils- прочитати файл
    // Files- прочитати файл


    public static void main(String[] args) throws IOException {

        File file = new File("text.txt");

        System.out.println(readFileWithBufferReader(file));// 1 BufferedReader
        System.out.println();
        System.out.println(readFileWithScanner(file));// 2 Scanner
        System.out.println();
        System.out.println(readFileWithFileUtils(file));// 3 FileUtils
        System.out.println();
        System.out.println(readFileWithFiles(file));//4 Files


        // читаємо с консоли scanner
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();


    }

    // ссилка в браузері на бредогениратор для файла https://ru.lipsum.com/


    //BufferedReader
    public static String readFileWithBufferReader(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            stringBuffer.append((char)ch);
        }
        return stringBuffer.toString(); // див вище 1 System.out.println(readFileWithBufferReader(file))
    }
    //Scanner


    public static String readFileWithScanner(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("");
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()){
            stringBuilder
                    .append(scanner.next())
                    .append(" ");
        }
        return stringBuilder.toString(); // див вище 2

    }
    //FileUtils

    // ссилка для встановленння Utils версії в папку  pom.xml для того щоб Util працював
    // https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0
public static String readFileWithFileUtils(File file) throws IOException {
    return FileUtils.readFileToString(file,Charset.defaultCharset());
}

    // Files
public static String readFileWithFiles(File file) throws IOException {
    return Files.readString(file.toPath());

}

// див вище 4  System.out.println(readFileWithFiles(file))
    
    



}
