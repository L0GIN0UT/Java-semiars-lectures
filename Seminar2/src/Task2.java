// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task2 {
//    Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd.
//    Результат: a4b3cd2
    public static void main(String[] args){
        String str = "aaaabbbcddyrrrhhu";
        System.out.println(counter(str));
    }

    static String counter(String str){
        StringBuilder comp = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if(count == 1)
                {
                    comp.append(str.charAt(i-1));
                }
                else {
                    comp.append(str.charAt(i - 1)).append(count);
                }
                count = 1;
            }

        }
        if(count == 1)
        {
            comp.append(str.charAt(str.length()-1));
        }
        else {
            comp.append(str.charAt(str.length() - 1)).append(count);
        }
        return comp.toString();
    }
}