package com.company;

class Arabic {

    private String imput;
    private String[] ab;
    int a;
    int b;
    private  int result;

     // конструктор
    Arabic (String s){
          this.imput = s;
    }

   // Сеттер переменной imput
   // public void setImput (String c) {
   //     this.imput = c;
   // }

    // Сеттер переменной result
    //private void setResult (int c) {
    //    this.result = c;
    //}

    //Геттер переменной result
    public int getResult () {
        return this.result;
    }


    public int Resultat(){

       try {
           ab = new String[2];
           ab = imput.split(" ");

           ab[0].trim();
           ab[1].trim();
           ab[2].trim();

           a = Integer.parseInt(ab[0]);
           b = Integer.parseInt(ab[2]);

           switch (ab[1]) {
               case "+" : this.result = a + b ; break;
               case "-" : this.result = a - b ; break;
               case "*" : this.result = a * b ; break;
               case "/" : this.result = a / b ; break;
           }



       } catch (Exception e)  {
            System.out.println("throw Exception Resultat()");
       }
        return this.result;
    }

}

