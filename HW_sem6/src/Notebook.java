import java.util.HashMap;
import java.util.Map;

public class Notebook {
    String company, color, resolution, OS, RAM_generation,RAM, HDD;;
    public String toString() {


        return String.format("Компания: %s Цвет: %s Разрешение экрана: %s Объём ЖД:" +
                " %s GB OС: %s Поколение ОП: %s Объём ОП: %s GB",
                company, color, resolution, OS, RAM_generation,RAM, HDD);
    }
}
