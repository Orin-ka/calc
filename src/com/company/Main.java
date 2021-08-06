package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) /*throws IOException*/ {

       try {
           // Запрашиваем выражение для вычисления
           System.out.println("Введите выражение для вычисления [число][операция +,-,*,/][число]");

           //Создаем сканер, считываем ввод
           Scanner scan = new Scanner(System.in);
           //Записываем ввод в строку str
           String str = scan.nextLine();

           // проверяем на соответствие шаблону выражения a + b (+, -, /, *)
           boolean result1 = str.matches("[1-9]{1}[ ]*[\\+-/*][ ]*[1-9]{1}");     // шаблоны для работы
           boolean result2 = str.matches("[1]{1}[0]{1}[ ]*[\\+-/*][ ]*[1-9]{1}"); // с арабским выражением
           boolean result3 = str.matches("[1-9]{1}[ ]*[\\+-/*][ ]*[1]{1}[0]{1}");
           boolean result4 = str.matches("[1]{1}[0]{1}[ ]*[\\+-/*][ ]*[1]{1}[0]{1}");

           boolean resultRom1 = str.matches("[IVX]+[ ]*[\\+-/*][ ]*[IVX]+"); //сверка с "грубым" шаблоном с римскими цифрами

           if (result1 | result2 | result3 | result4) {
               System.out.println("Выражение соответствует шаблону с арабскими числами");

               Arabic arab = new Arabic(str);
               arab.imput = str;
               arab.StringToExpression();
               System.out.println("Значение выражения = " + arab.result);

           } else {
               System.out.println("Выражение не соответствует шаблону с арабскими числами!");
               if (resultRom1) {
                   System.out.println("Выражение с римскими числами");
               } else {
                   System.out.println("Выражение не соответствует шаблону с римскими числами!");
               }
           }

       } catch (Exception e) {
           System.out.println("throw Exception 1");
       }
    }


}
