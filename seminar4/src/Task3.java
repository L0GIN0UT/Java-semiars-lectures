public class Task3 {
//    Реализовать стэк с помощью массива.
//    Нужно реализовать методы:
//    size(), empty(), push(), peek(), pop().
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.size());
        while (!myStack.empty()) {
            if (!myStack.empty()) {
                System.out.println(myStack.pop());
            }
        }
    }
}
