package com;
import java.io.*;
 class ExecutionTimer extends fail  { // жанадан класс ашамыз

           // переменный ашамыз жане оган старт деген  ат беремыз бырак ешкандай манге тенестырмимыз
    // дал солай ашып атын соны деп коямыз кез келген ат койсак болад бырак шатаспас ушын ынгайластырып end деп койдык
     public void end() {  // енд  атты класс курамыз программамыз дурыс аякталуы ушын

     }








    public static void main(String s[]) {
        // simple example

        long start  = System.currentTimeMillis(); //  это статистический метод класса System. Он возвращает количество времени в милисекундах от даты 1-1-1970 до настоящего времени.
        try(FileReader reader = new FileReader("Slozhnost.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        long end = System.currentTimeMillis(); // жане ендке быздын лонг шамамызды тенестыремыз
        long time;
        time=(end-start);
        System.out.println("\n" + time + " ms");

    }
}