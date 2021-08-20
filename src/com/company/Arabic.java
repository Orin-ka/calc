package com.company;

class Arabic {

    private String imput;
    int a;
    int b;
    private  int result;

     // конструктор
    Arabic (String s){
          this.imput = s;
    }

     // Сеттер переменной imput
    public void setImput (String c) {
        this.imput = c;
    }

    // Сеттер переменной result
    private void setResult (int c) {
        this.result = c;
    }

    //Геттер переменной result
    public int getResult () {
        return this.result;
    }


    public void StringToExpression() {

       try {
           String stra = this.imput.substring(0, 2);

           int k = imput.length() - 2;
           String strb = this.imput.substring(k);


              a = ToDigit(stra, 1);
              b = ToDigit(strb, k);


           if (imput.contains("+")) {
               this.result = a + b;
           }

           if (imput.contains("-")) {
               this.result = a - b;
           }

           if (imput.contains("*")) {
               this.result = a * b;
           }

           if (imput.contains("/")) {
               this.result = a / b;
           } //else this.result = 0;

       } catch (Exception e) {
           System.out.println("throw Exception 2");
       }
    }

    /*
   Метод обрезает i-тый элемент строки, если он не является числом
   и возвращает целое число из подстроки
    */
    public static int ToDigit(String st, int i1){

       try {
          char[] text = st.toCharArray();

          if (!(Character.isDigit(text[i1]))) {
              text[i1] = (char)32; //замена "не цифры" пробелом
           }

          // Массив символов перевести в строку
          String s = new String(text);
          //пробел обрезаем
          String resultString = s.trim();
          // переводим строку в integer, присваиваем атрибуту result
           this.setResult() = Integer.parseInt(resultString);

       } catch (Exception e) {
           System.out.println("throw Exception 3");
       }
        return this.getResult();
    }

}

