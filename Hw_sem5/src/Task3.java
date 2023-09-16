import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    // *Реализовать алгоритм пирамидальной]
    // сортировки (HeapSort)
    private static int previous(int i) {
        return (2*i + 1); // get previous i
    }

    private static int next(int i) {
        return (2*i + 2); // get next i
    }

    private static void swap(int[] arr, int frst, int scnd)
    {
        int temp = arr[frst];
        arr[frst] = arr[scnd]; // swap array elements
        arr[scnd] = temp;
    }

    private static void resHeapProp(int[] arr, int k, int size)
    {
        int prv = previous(k);
        int nxt = next(k); // a method to avoid violating the heap law:
        int max = k;       // 'max' is to hi on tree

        if (prv < size && arr[prv] > arr[k]) {
            max = prv;
        }

        if (nxt < size && arr[nxt] > arr[max]) {
            max = nxt;
        }

        if (max != k)
        {
            swap(arr, k, max);
            resHeapProp(arr, max, size);
        }
    }

    public static int popEl(int[] arr, int size)
    {
        if (size <= 0) {
            return -1;
        }

        int top = arr[0];
        arr[0] = arr[size-1];

        resHeapProp(arr, 0, size - 1);

        return top;
    }

    public static void sortHeap(int[] arr)
    {
        int len = arr.length;
        int n = (len - 2) / 2;

        while (n >= 0) {
            resHeapProp(arr, n--, len);
        }

        while (len > 0)
        {
            arr[len - 1] = popEl(arr, len);
            len--;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: " );
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элемент массива");
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        sortHeap(arr);

        System.out.println(Arrays.toString(arr));
    }
}
