package com.company;

public class Roman {

   String[] RomanNumerals = new String[] { "none", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

   String roman; //стока - число римскими цифрами
   int number;   //арабский эквивалент

  public int ToArab(String roman){ // Перевод римского числа в арабское
      int i, c;
      c = 0;   // вспомогательная переменная для возвращения значения метода
               // если строка - это не римские числа I - X, то возвращает 0
      for (i = 1; i <= 10; i++){        // нулевой символ массива не обрабатываем
          if (roman == RomanNumerals[i]) {
               c = i;
          } else {c = 0;}
      }
    return c;
  }

  public String ToRoman(int number){

      return RomanNumerals[number];

  }


}
