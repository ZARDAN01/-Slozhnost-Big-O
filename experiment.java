package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class experiment {
    public static void main(String[] args) throws IOException {
        String s = "www.mysite.com;";

        int n=11;
//проверяем заканчивается ли строка суффиксом "com"
        boolean isComEnding = s.endsWith(";");
        System.out.println(isComEnding);//выведет true

//проверяем заканчивается ли строка суффиксом "ru"
        boolean isRuEnding = s.contains("ru");
        System.out.println(isRuEnding);//выведет false
    }
}
  //for (int i = 0; i < symb.length; ++i)
      //  if (symb[i] == '+');

