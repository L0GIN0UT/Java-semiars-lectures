import java.util.HashMap;
import java.util.Map;

public class Notebook {
    String company, color, resolution, OS, RAM_generation,RAM, HDD;;
    public String toString() {


        return "Компания: " + company + " Цвет: " + color + " Resolution: " + resolution +
                " ЖД: " + HDD + "GB OС: " + OS + " Поколение ОП: " + RAM_generation +
                " Объём ОП: " + RAM + "GB";
    }
}
