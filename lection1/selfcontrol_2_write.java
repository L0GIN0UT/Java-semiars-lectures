import java.io.FileWriter;
import java.io.IOException;

public class selfcontrol_2_write {
    // 2. Даны два файла, в каждом из которых находится запись
    // многочлена. Сформировать файл содержащий сумму
    // многочленов.
    public static void main(String[] args){
        try(FileWriter fw = new FileWriter("first.txt",false)){
            fw.append("(4*a + b)");
            fw.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        try(FileWriter fw = new FileWriter("second.txt",false)){
            fw.append("(a + 6*b)");
            fw.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
           // 4*x^2 --> *x^2 --> a = 4
           
    }

}
