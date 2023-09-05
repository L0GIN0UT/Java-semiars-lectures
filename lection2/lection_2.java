package lection2;

import java.io.File;



public class lection_2 {
    public static void main(String[] args){
        // String str = "";
        // for (int i = 0; i < 1_000_000; i++) {
        //     str += "+";
        // }
        // // 41000 ms

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 1_000_000; i++) {
        //     sb.append("+");
        // }
        // // моментально (9 ms)

        // var s = System.currentTimeMillis();
        // //String str = "";
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 1_000_000; i++) {
        //     //str += "+";
        //     sb.append("+");
        // }
        // System.out.println(System.currentTimeMillis() - s);
        // //System.out.println(str);
        // //System.out.println(sb);


        // concat(): объединение строк
        // valueOf(): преобразует Object в строковое представление (завязан на toString())
        // join(): объединяет набор строк в одну с учетом разделителя
        // charAt(): получение символа по индексу
        // indexOf(): первый индекс вхождения подстроки
        // lastIndexOf(): последний индекс вхождения подстроки
        // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
        // replace(): замена одной подстроки на другую
        // trim(): удаляет начальные и конечные пробелы
        // substring(): возвращает подстроку, см.аргументы
        // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
        // сompareTo(): сравнивает две строки
        // equals(): сравнивает строки с учетом регистра
        // equalsIgnoreCase(): сравнивает строки без учета регистра
        // regionMatches(): сравнивает подстроки в строках
    
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); 
        // C,е,р,г,е,й
        
        //String VS StringBuilder

        // Много изменений - String
        // МНого преобразований - StringBuilder

        

        // File f1 = new File("file.txt");
        // File f2 = new File("C:/Users/Ivanlogin888/Desktop/JAVA/Java_geek/Java-semiars-lectures/lection2/file.txt");
    }

    class fileSystemDemo {
        public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath ());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
        }
       }
       

    //  ОБХОД ОШИБОК   
    // 
    //    try {
    //     Код, в котором может появиться ошибка
    //    } catch (Exception e) {
    //     Обработка, если ошибка случилась
    //    }
    //    finally {
    //     Код,
}
