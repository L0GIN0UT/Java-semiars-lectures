import java.util.*;

public class Task2 {
//        1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
    public static void main(String[] args) {
        String[] strings1 = new String[] {"a","b","c","d","e","f"};
        test1(strings1);
        System.out.println();
        String[] strings2 = new String[] {"1","2","3","4","5","6"};
        test2(strings2);
    }

    static void test1(String[] strings) {
        Stack<String> stack = new Stack<String>();
        stack.addAll(Arrays.asList(strings));
//        Collections.addAll(stack,strings);
//        System.out.println(stack);

//        for (String word: stack) {
//            System.out.println(word);
//        }
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

    static void test2(String[] strings) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(strings));
//        Collections.addAll(queue,strings);

        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
    }
}
