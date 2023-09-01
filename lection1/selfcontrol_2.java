import java.io.*;

public class selfcontrol_2 {
    public static void main(String[] args) throws Exception {
        FileReader frst = new FileReader("first.txt");
        int f;
        int count1 = 0;
        int valueA1 = 0;
        int valueB1 = 1;
        while ((f = frst.read()) != -1) {
            char fr = (char) f;
            System.out.print(fr);
            count1++;
            if (count1 == 2){
                valueA1 = fr - '0';
            }
        }
        
        System.out.print(" + ");

        FileReader scnd = new FileReader("second.txt");
        int s;
        int count2 = 0;
        int valueA2 = 1;
        int valueB2 = 0;
        while ((s = scnd.read()) != -1) { 
            char sc = (char) s;
            System.out.print(sc);
            count2++;
            if (count2 == 6){
                valueB2 = sc - '0';
            }
        }
        
        System.out.print(" = ");

        int sumA = valueA1 + valueA2;
        int sumB = valueB1 + valueB2;

        System.out.printf("%d*a + %d*b", sumA, sumB);
        
    }   
}