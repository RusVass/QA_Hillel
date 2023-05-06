package org.brit.HomeTask;




public class addElementString {



    public static String addElementToString(String string, String element, String s){
        return  string+ element;
    }

    public static String addElementToStringBeginning(String string, char element){
        return  element+ string;
    }

    public static String insertElementInString(String string, char ch, int position) {
        String beforePosition = string.substring(0, position);
        String afterPosition = string.substring(position);
        return beforePosition + ch + afterPosition;
    }



}