import java.util.HashMap;
import java.util.Map;

public class Pasport {
    private Map<String,String> pasports = new HashMap<String,String>();

    void add(String pasport, String name){
        pasports.put(pasport, name);
    }

    String getList(String pasport, String name){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : pasports.entrySet()) {
            sb.append("pasport: " + entry.getKey() + "SecondName: " + entry.getValue() + "\n");
        }
        return sb.toString();
    }

    String findByName(String name){
       StringBuilder sb = new StringBuilder();
       int count = 1;
        for (Map.Entry<String, String> entry : pasports.entrySet()) {
            String names = entry.getValue();
            String pasport = entry.getKey();
            if(names.equals(name)){
                sb.append(count++);
                sb.append(". ");
                sb.append(name);
                sb.append(": ");
                sb.append(pasport);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
