package seminar1;

import java.time.LocalTime;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        System.out.println("Укажите свое имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        System.out.println("Приветствую, " + name + "!");
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23){
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
    
