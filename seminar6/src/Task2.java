import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
//    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//    2. Создайте метод, в который передайте заполненный выше массив и с помощью
//    Set вычислите процент уникальных
//    значений в данном массиве и верните его в виде числа с плавающей запятой.
//    Для вычисления процента используйте формулу:
//    процент уникальных чисел = количество уникальных
//    чисел * 100 / общее количество чисел в массиве.
    public static void main(String[] args) {
        Integer[] array  = generate(0,24,1000);
        System.out.println(percent(array));
    }

    static double percent(Integer[] array){
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        double unic = set.size() * 100.0 / array.length;
        return unic;
    }

    static Integer[] generate(int min, int max,int amount){
        Integer[] array = new Integer[amount];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(min,max + 1);
        }
        return array;
    }
}
