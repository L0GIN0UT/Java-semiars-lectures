import java.util.*;

public class Task2 {
    // Пусть дан список сотрудников:
//     Иван Иванов, Светлана Петрова,
//     Кристина Белова, Анна Мусина,
//     Анна Крутова, Иван Юрин, Петр Лыков,
//     Павел Чернов, Петр Чернышов, Мария Федорова,
//     Марина Светлова, Мария Савина, Мария Рыкова,
//     Марина Лугова, Анна Владимирова, Иван Мечников,
//     Петр Петин, Иван Ежов. Написать программу, которая
    // найдет и выведет повторяющиеся имена с количеством
    // повторений. Отсортировать по убыванию популярности.
    // Для сортировки можно использовать TreeMap, мы не успели,
    // но я расписал пример использования и прикрепил к материалам
    // урока в файле TestTreeMap
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        Map<String, Integer> tree = new TreeMap<>();

        String text = "Иван Иванов, Светлана Петрова, " +
                "Кристина Белова, Анна Мусина, " +
                "Анна Крутова, Иван Юрин, Петр Лыков, " +
                "Павел Чернов, Петр Чернышов, Мария Федорова, " +
                "Марина Светлова, Мария Савина, Мария Рыкова, " +
                "Марина Лугова, Анна Владимирова, Иван Мечников, " +
                "Петр Петин, Иван Ежов.";
        text = text.replace(".", "");
        String[] workers = text.split(",");

        for (String worker : workers) {
            worker = worker.trim();
            String[] temp =  worker.split(" ");
            if(!names.contains(temp[0])){
                names.add(temp[0]);
            }
        }

        for(String el : names){
            int counter = 0;
            for (String worker : workers){
                if(worker.contains(el)){
                    counter++;
                }
            }
            tree.put(el, counter);
        }

        Map treeSorted = valueSort(tree);

        System.out.println(treeSorted);
    }

    public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
    {
        Comparator<K> valueComparator = new Comparator<K>() {

            public int compare(K k1, K k2)
            {
                int comp = map.get(k2).compareTo(
                        map.get(k1));
                if (comp == 0)
                    return 1;
                else
                    return comp;
            }

        };

        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);

        sorted.putAll(map);

        return sorted;
    }
}
