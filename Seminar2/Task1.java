

public class Task1 {
    public static void main(String[] args){
        char c1 = 'a';
        char c2 = 'b';
        int n = 8;
        System.out.println(repeat(c1, c2, n));
    }

    static String repeat(char c1, char c2, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n/2; i ++){
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}
