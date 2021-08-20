package com.company;

//import java.util.Arrays;


class Roman {

  private String roman; //строка - число римскими цифрами
  private int arab;   //арабский эквивалент

  private String[] RomanNumerals = new String[] { "null", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
    // private int[]   ArabicNumerals = new int[]   { 0,     1,     2,    3,     4,    5,   6,    7,     8,      9,   10 };

  // конструктор
  Roman (String s){
      this.roman = s;
  }

    public void setRoman (String strRoman) {
        this.roman = strRoman;
    }

    public String getRoman () {
        return this.roman;
    }

    public void setArab (int intArab) {
        this.arab = intArab;
    }

    public int getArab () {
        return this.arab;
    }


    // Перевод римского числа в арабское, если число от I до X

    public int ToArab(String stringRoman) throws RomaNumberNotIntervalException {

      try {
//    private String[] RomanNumerals = new String[] { "null", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
//    напоминание)

       int flag = 0;
          for (int i = 1; i <= 10; i++){
              if (stringRoman == RomanNumerals[i]) {
                  this.arab = i;
                  flag = i;
              }
          }

          if (flag == 0){
              throw new RomaNumberNotIntervalException("Строка " + stringRoman + "не удовлетворяет условию от I до X " );
          }


           /* for (int i = 1; i <= 10; i++){
               if (stringRoman == RomanNumerals[i]) {
                   this.arab = i;
               }

           }*/

      } catch (Exception ex) {
              System.out.println("Ошибка перевода римского числа в арабское");
      }

    return arab;

  }


// Перевод арабского числа в римское , интервал от 1 до 100
// дописать.........

  public String ToRoman(int number) {


         if ((number >= 1) && (number <= 100)) {
             this.roman = RomanNumerals[number];
         }


      return RomanNumerals[number];
  }


}
