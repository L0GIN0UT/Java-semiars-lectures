import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phonebook_values {
    private Map<String,String> book = new HashMap<String,String>();

    public void add(String phone, String name) {
        book.put(phone, name);
    }

    String getList(){
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<String,String> entry: book.entrySet()){

            String name = entry.getValue();
            String phone = entry.getKey();

            sb.append("Phone: ");
            sb.append(phone);
            sb.append(" Name: ");
            sb.append(name);
            sb.append("\n");
        }
        return sb.toString();
    }

    String getNameByPhone(String phone){
        return "Name: " + book.get(phone);
    }

    String getPhonesByName(String name){
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<String,String> entry: book.entrySet()){
            if(entry.getValue().equals(name)){
                sb.append("Phone: ");
                sb.append(entry.getKey());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public void delete(String value){
        Iterator<Map.Entry<String,String>> iter = book.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> entry = iter.next();
            String name = entry.getValue();
            String phone = entry.getKey();
            if (name.equals(value) || phone.equals(value)) {
                iter.remove();
            }
        }
    }

    public void change(String value, String new_value){
        Iterator<Map.Entry<String,String>> iter = book.entrySet().iterator();
        boolean check = false;
        String temp = "";
        while (iter.hasNext()) {
            Map.Entry<String,String> entry = iter.next();
            String name = entry.getValue();
            String phone = entry.getKey();
            if (name.equals(value)) {
                book.replace(phone,new_value);
            }
            if (phone.equals(value)){
                temp = entry.getValue();
                iter.remove();
                check = true;
            }
        }
        if (check) {
            book.put(new_value, temp);
        }
    }

}
