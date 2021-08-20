package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) /*throws IOException*/ {

       try {

           System.out.println("Введите выражение для вычисления [число][операция +,-,*,/][число]");
           Scanner scan = new Scanner(System.in);
           String str = scan.nextLine();

           // проверяем на соответствие шаблону выражения a (+-/*) b
           boolean patternArab1 = str.matches("[1-9]{1}[ ]*[\\+-/*][ ]*[1-9]{1}");// шаблоны для работы
           boolean patternArab2 = str.matches("[1-9]{1}[ ]*[\\+-/*][ ]*[1]{1}[0]{1}");
           boolean patternArab3 = str.matches("[1]{1}[0]{1}[ ]*[\\+-/*][ ]*[1-9]{1}");
           boolean patternArab4 = str.matches("[1]{1}[0]{1}[ ]*[\\+-/*][ ]*[1]{1}[0]{1}");

           boolean patternRom = str.matches("[IVX]+[ ]*[\\+-/*][ ]*[IVX]+"); //сверка с "грубым" шаблоном с римскими цифрами

           if (patternArab1||patternArab2||patternArab3||patternArab4)  {
            //   System.out.println("Выражение соответствует шаблону с арабскими числами");

               Arabic arab = new Arabic(str);
               arab.setImput(str);

               System.out.println("Значение выражения = " + arab.Resultat());

           } else {
               System.out.println("Выражение не соответствует шаблону с арабскими числами!");
               if (patternRom) {
                   System.out.println("Выражение с римскими числами");

                   Roman rom = new Roman(str);

               } else {
                   System.out.println("Выражение не соответствует шаблону с римскими числами!");
               }
           }

       }  catch( RomaNumberNotIntervalException ex){
           System.out.println(ex.getMessage());
          catch (Exception ex) {
               System.out.println("throw Exception 1");
           }
    }


}
