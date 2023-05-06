package org.brit.lesson23;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

//Работа с файлами и коллекциями
//
//        Цель: получить основные навыки вычитки данных из файла, добавление данных в коллекции и манипуляции с последними
//
//        Дано: Файл с данными data.txt с данными по типу csv. Разделителем является запятая
//
//        Нужно:
//        1. Вычитать файл в коллекцию вида Map<Integer, String>. Реализовать функцию
//        Map<Integer, String> getDataFromFile(File dataFile)
//
//        2. Реализовать функцию поиска по id в Map.
//        String getDataById(Map<Integer, String> mapData, Integer id)
//
//        3. Реализовать функцию подсчета вхождения одинаковый фамилий
//        int getNumberOfOccurrences(Map<Integer, String> mapData, String lastName)
//
//        Note! Иванов И. и Иванов В. - это будем считать 2 вхождения. Считаем именно фамилии.
//        Note! Не использовать библиотека для работы с коллекциями
//        Note! Способ чтения файла - на ваш выбор. Я бы посоветовал FileUtils. Но его нужно добавить в зависимости в pom.xml





public class FileAndCollections {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> dataFromFile = getDataFromFile(new File("data.txt"));
        System.out.println(getDataById(dataFromFile, 1001));
        System.out.println(getNumberOfOccurrences(dataFromFile, "Ivanov"));

        Map<String, List<Integer>> equalNames = getEqualName(dataFromFile);
        System.out.println(equalNames);

    }

    public static Map<Integer, String> getDataFromFile(File dataFile) throws IOException {
        List<String> list = FileUtils.readLines(dataFile, Charset.defaultCharset());
        Map<Integer, String> result = new HashMap<>();
        for (String line : list) {
            String[] split = line.split(",");
            result.put(Integer.parseInt(split[0].trim()), split[1].trim());
        }
        return result;
    }

    public static String getDataById(Map<Integer, String> mapData, Integer id) {
        return mapData.get(id);
    }

    public static int getNumberOfOccurrences(Map<Integer, String> mapData, String lastName) {
        Collection<String> values = mapData.values();
        int count = 0;
        for (String name : values) {
            if (name.split(" ")[0].trim().equals(lastName)) {
                count++;
            }
        }
        return count;


    }
// робить виборку по одинаковим фаміліям та id
    public static Map<String, List<Integer>> getEqualName(Map<Integer, String> mapData) {
        Map<String, List<Integer>> result = new HashMap<>();

        for (Map.Entry<Integer, String> entry : mapData.entrySet()) {
            String name = entry.getValue().trim().split(" ")[0];
            if (!result.containsKey(name)) {
                List<Integer> id = new ArrayList<>();
                id.add(entry.getKey());
                result.put(name, id);

            } else {
                List<Integer> ids = result.get(name);
                ids.add(entry.getKey());
                result.put(name, ids);
            }
        }

        Map<String, List<Integer>> resultToReturn = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : result.entrySet()) {
            if (entry.getValue().size() > 1) {
                resultToReturn.put(entry.getKey(), entry.getValue());
            }
        }

        return resultToReturn;
    }

}