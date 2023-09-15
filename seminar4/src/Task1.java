import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task1 {
    public static void main(String[] args) {
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида
//        text~num
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//        List<String> list = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            String input = scanner.nextLine();
//            String[] tokens  =  input.split("~");
//            if(input.equals("finish")) {
//                break;
//            }
//            int num = Integer.parseInt(tokens[1]);
//
//            if(tokens[0].equals("print")){
//                String a = list.remove(num);
//                System.out.println(a);
//            }
//            else{
//                list.add(num,tokens[0]);
//            }
//        }
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            if (line.equals("finish")){
                System.out.println("До новых встреч");
                break;
            }
            String[] parts = line.split("~");
            int num = Integer.parseInt(parts[1]);
//           if (num >= list.size() || num < 0){
//               System.out.println("Индекс за пределами массива");
//               continue;
//           }
            String text = parts[0];
            switch (text){
                case "print":
                    System.out.println(list.remove(num));
                        break;
                    default:
                        list.add(num, text);
                }
            }
    }
}