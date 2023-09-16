public class Task1 {
    // Реализуйте структуру телефонной
    // книги с помощью HashMap, учитывая,
    // что 1 человек может иметь несколько
    // телефонов.
    public static void main(String[] args) {
        Phonebook_values book = new Phonebook_values();

        book.add("89271231212","Иван Петров");
        book.add("89271232425","Иван Комаров");
        book.add("89271231234","Иван Петров");
        book.add("89271235456","Евгений Сидоров");
        book.add("89271236789","Евгений Смирнов");
        book.add("89275673454","Екатерина Лаптева");
        book.add("89273506767","Сергей Сергеев");

        System.out.println(book.getList());

        System.out.println(book.getPhonesByName("Иван Петров"));
        System.out.println(book.getPhonesByName("Иван Комаров"));

        System.out.println(book.getNameByPhone("89273506767"));
        System.out.println();

        book.delete("89271232425");
        book.delete("Иван Петров");
        System.out.println(book.getList());


        book.change("Сергей Сергеев","Серый");
        book.change("89275673454","1234");
        System.out.println(book.getList());
    }
}
