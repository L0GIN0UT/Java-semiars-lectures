import java.util.Random;
import java.util.Scanner;
public class selfcontrol_1 {
    // 1. Задана натуральная степень k. Сформировать случайным
    // образом список коэффициентов (значения от 0 до 100)
    // многочлена многочлен степени k.
    // *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("k: ");
        String k = iScanner.nextLine();
        iScanner.close();

        Random rand = new Random();

        int choise = rand.nextInt(1,4);
        if (choise == 1){
            String first = rand.nextInt(1,10)+ "*x^" + k +" + "+ rand.nextInt(1,10) + "*x " + rand.nextInt(1,10) + " = 0";
            System.out.println(first);
        }
        if(choise == 2){
            String second = "x^" + k + " + " + rand.nextInt(1,10) + " = 0";
            System.out.println(second);
        }
        if(choise == 3){
            String third = rand.nextInt(1,10) + "*x^" + k + " = 0";
            System.out.println(third);
        }
    }
}
