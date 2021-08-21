package com.company;


class Roman {

     private String imput; //переменная для строки ввода
     private String roman; //строка - число римскими цифрами

     private String resultRom; //переменная для строки результата


      // конструктор
      Roman (String s){
           this.imput = s;
      }

      public void setResultRom(String s) {
          this.resultRom = s;
      }


      public String getresultRom () {
           return this.resultRom;
      }


    // Перевод одного римского числа в арабское, если число от I до X

       public int ToArab (String stringRoman)   throws RomaNumberNotIntervalException {


            String[] RomanNumerals;
            RomanNumerals = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

            int arabic = 0 ;   //арабский эквивалент
            int flag = 0;

            stringRoman = stringRoman.trim();

           try {

               for (int i = 1; i <= 10; i++) {
                   if (stringRoman.equals(RomanNumerals[i])) {
                       arabic = i;
                       flag = i;
                   }
               }

               if (flag == 0) {
                   throw new RomaNumberNotIntervalException("Строка " + stringRoman + " не удовлетворяет условию от I до X ");
               }

           }
           catch(RomaNumberNotIntervalException ex) {
                   System.out.println(ex.getMessage());
           }

            catch (Exception ex) {
              System.out.println("Ошибка перевода римского числа в арабское");
           }


           return arabic;

       }


      // Перевод арабского числа в римское , интервал от 1 до 100

      public String toRoman (int intArab){

           String[] ones = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
           String[] tens = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
           String[] hunds = new String[] {"", "C", "CC", "CCC"};

           int h = intArab / 100;
           int t = (intArab - 100 * h ) / 10;
           int o = intArab - 100 * h - 10 * t;

           return hunds[h] + tens[t] + ones[o];
      }


       public String ResultatRom (){

          try {
            String[] cd = imput.split(" ");

           // cd[0].trim();
           // cd[1].trim();
           // cd[2].trim();

            int c = this.ToArab(cd[0]);
            int d = this.ToArab(cd[2]);
            int resultArab = 0; //переменная для строки результата


             switch (cd[1]) {
                case "+" : resultArab = c + d ; break;
                case "-" : resultArab = c - d ; break;
                case "*" : resultArab = c * d ; break;
                case "/" : resultArab = c / d ; break;
             }

            if ((resultArab > 0)&&(resultArab <= 100)) {
                this.setResultRom(toRoman(resultArab));
            }

          } catch (Exception e)  {
            System.out.println("throw Exception Resultat()");
          }


          return getresultRom();
       }


}
