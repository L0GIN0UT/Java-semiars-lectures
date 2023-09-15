import java.util.Scanner;

public class lection1 {
    
    public static void main(String[] args){

        System.out.println("Hello world!");

        System.out.println(' ');

        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456

        System.out.println(' ');

        float e = 2.7f;
        double pi = 3.14159;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.14159
        
        System.out.println(' ');

        char ch = '1';
        System.out.println(ch); // 1
        ch = 'a';
        System.out.println(ch); // a

        System.out.println(' ');

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234;
        System.out.println(flag2); // false
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // true // ^ - разделительная дезъюнкция (один из  == true)

        System.out.println(' ');

        String msg = "Hello world";
        System.out.println(msg);
        msg += '!';
        System.out.println(msg);

        System.out.println(' ');

        // Неявная типизация
        var i = 'a';
        class Typetester {
            void printType(byte x) {
                System.out.println(x + " is an byte");
            }
            void printType(int x) {
                System.out.println(x + " is an int");
            }
            void printType(float x) {
                System.out.println(x + " is an float");
            }
            void printType(double x) {
                System.out.println(x + " is an double");
            }
            void printType(char x) {
                System.out.println(x + " is an char");
            }

        }  
            Typetester t = new Typetester();
            t.printType(i); // a is an char

            System.out.println(' ');

            System.out.println(getType(i)); // Character

            System.out.println(' ');
        
            // Классы обертки

            int a = 23_123_34;
            System.out.println(Integer.MAX_VALUE); // 2147483647
            System.out.println(Integer.MIN_VALUE); // -2147483648

            System.out.println(' ');

            // Операции Java
            
            // Присваивание - =
            // Арифметические - *,/,+,-,%,++,--
            // Операции сравнения - <,>,==,!=,>=,<=
            // Логические операции - ||,&&,^,!
            // Побитовые операции - <<,>>,&,|,^

            // Порядок
            int b = 123;
            System.out.println(b); // 123

            // System.out.println(b++); // 123
            // System.out.println(b); // 124

            // System.out.println(++b); // 124

            int def = 12;
            int x = def--;
            int y = --def;

            System.out.println(x); // 12
            System.out.println(y); // 10

            def = x - y;
            System.out.println(def); // 2
            def = y - x;
            System.out.println(def); // -2

            int p = 5;
            int s = 2;
            System.out.println(p | s); // 7
            // 5 - 101
            // 2 - 010
            // ? - 111
            System.out.println(p & s); // 0 
            // 5 - 101
            // 2 - 010
            // ? - 000

            // String qwer = "qwer"; // 4, 0...3
            // boolean q = qwer.length() >= 5 && qwer.charAt(4) == '1';
            // System.out.println(q);// false

            // String qwer = "qwwe1"; // 5, 0...4
            // boolean q = qwer.length() >= 5 && qwer.charAt(4) == '1';  <-- если 1 false то сразу выходит
            // System.out.println(q);// true

            // String qwer = "qww1"; // 5, 0...4
            // boolean q = qwer.length() >= 5 & qwer.charAt(4) == '1';   <-- проверяет 2 условия
            // System.out.println(q);// true

            //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
            // at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            // at java.base/java.lang.String.charAt(String.java:1512)
            // at lection1.lection1.main(lection1.java:137)

            // Массивы
            // int[] arr = new int[10];
            int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 7};
            System.out.println(arr[3]);

            // 2-мерный массив
            int[] arr1[] = new int[3][5];
            for(int[] line : arr1){
                for(int item : line){
                    System.out.printf("%d", item);
                }
                System.out.println();
            }
            // 00000
            // 00000
            // 00000

            
            // Преобразование

            int o = 123; double d = o;
            System.out.println(o); // 123
            System.out.println(d); // 123.0
            d = 3.1415; o = (int)d;
            System.out.println(d); // 3.1415
            System.out.println(o); // 3

            d = 3.9415; o = (int)d;
            System.out.println(d); // 3.9415
            System.out.println(o); // 3

            byte l = Byte.parseByte ("123");
            System.out.println(l); // 123

            // l = Byte.parseByte ("1234");

            //System.out.println(l); // NumberFormatException: Value out of range

            // Получение данных из терминала

            // Scanner iScanner = new Scanner(System.in);
            // System.out.println("name: ");
            // String name = iScanner.nextLine();
            // System.out.printf("Привет, %s!", name);
            // iScanner.close();

            // Scanner iScanner1 = new Scanner (System.in);
            // System.out.printf ("int a: ");
            // int x1 = iScanner1.nextInt();
            // System.out.printf ("double a: ");
            // double y1 = iScanner1.nextDouble();
            // System.out.printf("%d + %f = %f", x1, y1, x1 + y1);
            // iScanner1.close() ;

            // Scanner iScanner = new Scanner (System.in);
            // System.out.printf ("int a: ");
            // boolean flag = iScanner.hasNextInt();
            // System.out.println (flag);
            // int po = iScanner.nextInt();
            // System.out.println(po);
            // iScanner.close() ;

            // int a1 = 1, b1 = 2;
            // int c1 = a1 + b1;
            // String res = a1 + " + " + b1 + " = " + c1;
            // System.out.println(res); 

            //qwer + 123 = qwer123 --- 4 строки 
            // объявление переменной
            // преобразование
            // res
            // ...


            int a1 = 1, b1 = 2;
            int c1 = a1 + b1;
            String res = String.format("%d + %d = %d \n", a1, b1, c1);
            System.out.printf("%d + %d = %d \n", a1, b1, c1);
            System.out.println(res);

            // %d: целочисленных значений
            // %x: для вывода шестнадцатеричных чисел
            // %f: для вывода чисел с плавающей точкой
            // %e: для вывода чисел в экспоненциальной форме,
            // например, 3.1415e+01
            // %c: для вывода одиночного символа
            // %s: для вывода строковых значений


            float pi1 = 3.1415f;
            System.out.printf("%f\n", pi1); // 3,141500
            System.out.printf("%.2f\n", pi1); // 3,14
            System.out.printf("%.3f\n", pi1); // 3,141
            System.out.printf("%e\n", pi1); // 3,141500e+00
            System.out.printf("%.2e\n", pi1); // 3,14e+00
            System.out.printf("%.3e\n", pi1); // 3,141e+00
            
            sayHi();

            int a2 = 1;
            int b2 = 2;
            int min = a2 < b2 ? a2 : b2;
            System.out.println(min);



    }

    static String getType(Object i){
        return i.getClass().getSimpleName();
    }
    
                // Функции и методы

                static void sayHi() {
                System.out.println("hi!");
                
                }
                
                static int sum(int a, int b) {
                return a+b;
                
                }
                
                static double factor (int n) {
                if (n==1) return 1;
                return n * factor(n-1);
                
                }
                
                static void sayHi(String[] args) {
                sayHi(); // hi!
                System.out.println(sum(1, 3)); // 4
                System.out.println(factor(5)); // 120.0
        }
}


// import java.util.Scanner;
// public class Program {
//         public static void main(String[] args) {
//             int mounth = value;
//             String text = "";
//             switch (mounth) {
//                 case 1:
//                     text = "Autumn";
//                     break;
//             ...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }


// Цикл while
// public class Program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }


// Цикл do while
// public class Program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }


// Вложенные циклы
// public class Program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }


//Работа с файлами
// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//  } }


// Чтение, Вариант посимвольно
// import java.io.*;
// public class Program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//         } else {
//             System.out.print(ch);
//         }
//     }
//  } }

// Вариант построчно
// import java.io.*;
// public class Program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }


// Задачи для самоконтроля
// 1. Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
// 2. Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.
    
