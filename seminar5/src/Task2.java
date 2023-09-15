import java.util.HashMap;
import java.util.Map;

public class Task2 {
//    Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true

    public static void main(String[] args) {
        System.out.println(izomorfs("mama","papa"));
    }

    static boolean izomorfs(String s, String t){
        Map<Character,Character> rools = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(rools.containsKey(s.charAt(i))){//  "paper"  "tisle"
                if(rools.get(s.charAt(i)).equals(t.charAt(i))){
                    continue;
                }
                else {
                    return false;
                }
            }
            else{
                rools.put(s.charAt(i),t.charAt(i));
            }
            System.out.println(rools);
        }
        return true;
    }
}



//    public static void main(String[] args) {
//        String s1 = "paper";
//        String s2 = "title";
//        System.out.println(izomorph(s1, s2));
//    }

//    static boolean izomorph(String s1, String s2){
//        //проверяем по длинне
//        if (s1.length() != s2.length()){
//            return false;
//        }
//
//        Map<Character, Character> map = new HashMap<>();
//        //получаем массив символов
//        char[] chars1 = s1.toCharArray();
//        char[] chars2 = s2.toCharArray();
//
//        for (int i = 0; i < chars1.length; i++) {
//            //получаем текущие символы
//            char c1 = chars1[i];
//            char c2 = chars2[i];
//            //проверяем встречалось ли правило
//            if (!map.containsKey(c1)){
//                //если ключа не было, а значение есть, то возвращаем false
//                if (map.containsValue(c2)){
//                    return false;
//                }
//                //добавляем правило
//                map.put(c1, c2);
//            } else {
//                //проверяем правило
//                if (map.get(c1) != c2){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

