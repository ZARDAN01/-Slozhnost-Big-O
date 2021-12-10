package com;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main extends fail {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        BufferedReader br = null; // BufferedReader класында жана обьект ашамыз жане ол басынан ештенеге тен емес

        long start  = System.currentTimeMillis(); //  эт
        try { // егер быз файл аша алмасак сол файлдын ошибкасын табу ушын быз исключения колданамыз

            // Жанадан файл ашу

            File file = new File("Slozhnost.txt");      // жанадан файл ашамыз,жана обьект курамыз оны file деп атадым жане оган параметрне  название бердм.  бул файл быздын проект турган папка ышынде турады ойткены быз оган жол корсеткен жокпыз
           // Scanner scan = new Scanner(file);
            if (!file.exists())                                         // егер бызде дал осы атты файл болса быз оны жанадан ашпаймыз ягни false леп бегысы (!)
                file.createNewFile();                                  // ал егер файл жок болса быз оны жанадан ашамыз ал егер жанадан ашу керек болса исключения шакырылады
            PrintWriter pw = new PrintWriter(file);                         // файлга быр нарсе жазу ушын PrintWriter класын колданамыз обьектыге  pw кыскартып ал конструкторге беретн параметрге file обьектысын жазамыз
            String num = in.nextLine();
            String num1 = in.nextLine();
            String num2 = in.nextLine();
            String num3 = in.nextLine();
            String num4 = in.nextLine();
            String num5 = in.nextLine();
            String num6 = in.nextLine();
            String num7 = in.nextLine();
            String num8 = in.nextLine();
            String num9 = in.nextLine();
            String num10 = in.nextLine();
            String num11 = in.nextLine();
            String num12 = in.nextLine();
            String num13 = in.nextLine();
            String num14 = in.nextLine();
            String num15 = in.nextLine();
            String num16 = in.nextLine();
            String num17 = in.nextLine();
            String num18 = in.nextLine();
            String num19 = in.nextLine();
            String num20 = in.nextLine();
            String num21 = in.nextLine();
            String num22 = in.nextLine();
            String num23 = in.nextLine();
            String num24 = in.nextLine();
            String num25 = in.nextLine();







            pw.println(num  );  //   pw обьектысын жане println методын колданып файлга керек манды енгыземыз
            pw.println(num1 );
            pw.println(num1 );
            pw.println(num2 );
            pw.println(num3 );
            pw.println(num4 );
            pw.println(num5 );
            pw.println(num6 );
            pw.println(num7 );
            pw.println(num8 );
            pw.println(num9 );
            pw.println(num10 );
            pw.println(num11 );
            pw.println(num12 );
            pw.println(num13 );
            pw.println(num14 );
            pw.println(num15 );
            pw.println(num16 );
            pw.println(num17 );
            pw.println(num18 );
            pw.println(num19 );
            pw.println(num20 );
            pw.println(num21 );
            pw.println(num22 );
            pw.println(num23 );
            pw.println(num24 );
            pw.println(num25 );
          //  int i = 1;
          //  while (scan.hasNextLine()) {
           //     System.out.println(i + " : " + scan.nextLine());
           //     i++;
          //  }
            pw.close();  //файлмен жумыс жасаганнан кейын оны жабуымыз керек сондыктан close методын колданамыз

            br = new BufferedReader(new FileReader("Slozhnost.txt ")); // конструкторге параметр ретнде быз  new FileReader( "Slozhnost.txt ") жазамыз ойткенв ол осы класс аркылы сол файлды ыздей алады
            String line;                                                     // жана переменный ашамыз бул жерде окылган файлдагы малыметты строка бойынша быр бырден кезек бойынша окылуы жане ары карай жалгасуы ушын кажет
            while ((line = br.readLine()) != null ) {                       // быз строка бойынша окуды цикл аркылы жузеге асырамыз (line переменныйына br.readLine дагы жана окылган  строканы тенестыремыз ягни жазамыз егер окылган строка пустой болса онда быз циклдан шыгамыз )


                // быз циклдын ышыне енгызуымыз керек файлдын ышындегы шаманы ойткены файлды тексеруге олкен комек корсетеды

                boolean n1 = line.contains("{");
                if (n1 == true) {
                    char[] symb = line.toCharArray();
                    int count = 0;
                    for (int i = 0; i < symb.length; ++i)
                        if (symb[i] == '{')
                            ++count;
                    System.out.println("кайталануы " + count + " рет");


                    if (count == 0) {
                        System.out.println("(1)");
                    }
                    if (count == 1) {

                        System.out.println("(n)");

                }  if (count == 2) {

                    System.out.println("n(log(n)");
                }  if (count == 3) {

                    System.out.println("(n2)");
                    ;
                }  if (count >= 4) {

                                        System.out.println("n!");
                                        ;
                                    }
                    boolean n12 = line.endsWith("}");
                    if (n1 == true) {
                        char[] sym = line.toCharArray();
                        int coun = 0;
                        for (int i = 0; i < sym.length; ++i)
                            if (symb[i] == '}')
                                ++coun;

                        System.out.println("кайталануы " + coun + " рет");

                        if (coun == 0) {
                            System.out.println("(1)");
                        }
                        if (coun == 1) {

                            System.out.println("(n)");

                        }  if (coun == 2) {

                            System.out.println("n(log(n)");
                        }  if (coun == 3) {

                            System.out.println("(n2)");
                            ;
                        }  if (coun >= 4) {

                            System.out.println("n!");
                            ;
                        }
                        for (int i = 0; i < symb.length; ++i)
                            if (symb[i] == '{')
                                ++coun;
                        System.out.println("кайталануы " + coun + " рет");

                                    //boolean n13 = line.contains("</module>");
                                    //System.out.println(n13);// не нашел - выведет false
                                    // if (false == n13) {
                                    // System.out.println("eeeeeeeeeeeeeeeeeeee");
                                    // } else {
                                    //  System.out.println("ffffffffffffffffffffff");
                                    // }  System.err.println("Error" );


                    }}}
        }catch (IOException err) {                                  // егер файл аша алмасак осы исключение шакырылады
            System.err.println("Error" + err);                          // екранда неге файл ашылмаганы жонынде акпарат шыгады
        } finally { // BufferedReader ды жабу керек сондыктан блок finally колданамыз
            try {
                br.close();
            } catch (IOException err) {                                  //
                System.err.println("Error" + err);                          //

            }
        }

        long end = System.currentTimeMillis(); // жане ендке быздын лонг шамамызды тенестыремыз
        long time;
        time=(end-start);
        System.out.println("\n" + time + " ms");

    }
}