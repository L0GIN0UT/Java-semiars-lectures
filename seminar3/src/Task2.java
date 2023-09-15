import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {
//        //Создать список типа ArrayList
//        //Поместить в него как строки, так и целые числа.
//        //Пройти по списку, найти и удалить целые числа.
//
        List list = new ArrayList();
        list.add(1.345);
        list.add("3223");
        list.add(234);
        list.add(-34);
        list.add("Привет");
        list.add(3432);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer){
//                list.remove(i);
//                i -= 1;
//            }
//        }

//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            if(it.next() instanceof Integer){
//                it.remove();
//            }
//        }

        list.removeIf(o -> o instanceof Integer);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
    }
}
