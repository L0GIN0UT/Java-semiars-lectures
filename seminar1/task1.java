// package seminar1;

public class task1 {
    public static void main(String[] args){
        // Дан массив двоичных чисел, например [1,1,0,1,1,1],
        // вывести максимальное количество подряд идущих 1.
        int[] arr = {1,1,0,1,1,1,1};
        int counter = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                counter++;
            }
            {
                if(counter > maxValue){
                    maxValue = counter;
                    counter = 0;
                }
            }
        }
            if(counter > maxValue){
            maxValue = counter;
            }
        System.out.println(maxValue);
    }
}
