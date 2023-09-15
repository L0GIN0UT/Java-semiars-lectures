import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
//        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях
//        - названия книг. Напишите метод для заполнения данной структуры.
        List<List<String>> catalog = new ArrayList<>();
        add(catalog,"fantasy","Harry Potter");
        System.out.println(catalog);
        add(catalog,"fairytale","Colobok");
        System.out.println(catalog);
        add(catalog,"fairytale","Repka");
        System.out.println(catalog);
        add(catalog,"Romance","woina i mir");
        System.out.println(catalog);
        add(catalog,"Romance","Romance");
        System.out.println(catalog);
    }
    static void add(List<List<String>> bookShop, String genre,String nameOfBook){
        //[[comedy, name1, name2, name3],[farytale, name1, name2, name3]]
        for (int i = 0; i < bookShop.size(); i++) {
            List<String> list = bookShop.get(i);
            if(list.get(0).equals(genre)){
                if (!list.contains(nameOfBook)){
                    list.add(nameOfBook);
                }
                return;
            }
        }
        List<String> new_list = new ArrayList<>();
        new_list.add(genre);
        new_list.add(nameOfBook);
        bookShop.add(new_list);
    }
}
