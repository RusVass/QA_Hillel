package org.brit.lesson6;

import java.util.Locale;

public class TaskPalindrome {

    public static void main(String[] args) {
        String s = "Levelek";
        s = s.replaceAll(" ", "").toLowerCase();

      //  System.out.println(isPalindrome(s) ? "YES" : "NO");

        System.out.println("string '%s' is %s palindrome"
                .formatted(s,isPalindrome(s)? "": "not"));
    }

// первый вариант
//    private static boolean isPalindrome(String s){
//     if (s.length() == 1 || s.length() == 0)
//           return true;
//        if (s.charAt(0) == s.charAt(s.length()-1))
//            return isPalindrome(s.substring(1,s.length()-1));
//            return  false;
//
//      }
// второе решение
//    private static boolean isPalindrome(String s) {
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
//                return false;
//            }
//        }
//        return true;
//        }
// третий вариант
    private static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length()-1; i < s.length() / 2; i++, j--){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
        }

        }
