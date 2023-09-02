package seminar1;

public class task3 {
    public static void main(String[] args){
        // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        String text = "Добро пожаловать на курс по Java";
        String[] arr = text.split(" ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + ' ');
        }
    }
}
