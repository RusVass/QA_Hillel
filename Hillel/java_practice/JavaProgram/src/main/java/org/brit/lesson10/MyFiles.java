package org.brit.lesson10;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class MyFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("files", "text1.txt");//зєднатися з файлом
        System.out.println();
        System.out.println(file.getAbsolutePath());// викатує путь до файла

        File dir = new File("files", "dir1");//створення заготовки для нової директорії в папяті поки що не створений фізично на диску.

        // dir.deleteOnExit();автоматчно удаляє після закіннчення роботи  з файлом
        dir.mkdir(); //створення нової директрорії фізично


        File file1 = new File("files", "file1.txt");// створення в памяті файла
        file1.createNewFile(); // створення фізично файла

        //dir.delete(); // видалення

        if (dir.exists()) { //перевіряє чи існує папка для видалення
          //  dir.delete(); // видалення
        }



        //file.deleteOnExit(); // видаляє файл після закінчення роботи програми автоматчно видаляє
        //file.compareTo(); // порівняння файла
        //file.createNewFile();// сворення нового файла

    //getName
        System.out.println(file1.getName());//візьме имя з роширення
    //    getFreeSpace
        System.out.println(file1.getFreeSpace());// показує скільки  вільного місця на  файла
    // lastModified
        System.out.println();

        System.out.println(file1.lastModified()); //дата сворення файла
    // виводить дату файла в зрозумілому форматі
        Date date = new Date();
        date.setTime(file1.lastModified());
        System.out.println(date);

        System.out.println();
/// виводить вміст папки files
        File dir1 = new File("files");
        String[] list = dir1.list();
        Arrays.stream(list).forEach(System.out::println);//роздруковав що є у папці files
        System.out.println();
//  виводить шлях тип документа
        File[] files = dir1.listFiles();
        Arrays.stream(files).map(false3->file1.getAbsolutePath()).forEach(System.out::println);
        System.out.println();
// переводить на браузер (копіруєм ссилку в консолі і вставляемо в браузер )
        System.out.println(file.toURI());




    }
}
