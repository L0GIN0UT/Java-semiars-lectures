import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;


public class Task4 {
//    Напишите метод, который составит строку, состоящую из 100
//    повторений слова TEST и метод, который запишет эту
//    строку в простой текстовый файл, обработайте исключения.
static Logger logger;
//        logger.log(Level.INFO, "Начало работы");
//        FileHandler fh = new FileHandler();

    public static void main(String[] args){
        createLogger();
        String word = "Super";
        int count = 100;
        String res = repeat(word,count);
        String filePath = "src/text.txt"; //Task4.class.getPackageName() + "\text.txt";
        writeToFile(res,filePath);
        closeLog();

    }

    static void writeToFile(String word, String filePath){
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(word);
            writer.write("\n");
            writer.flush();
            logger.log(Level.INFO, "Запись прошла успешно");
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING,"Запись не удалась");
        }
    }

    public static String repeat(String word, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < count; i++) {
            stringBuilder.append(word);
        }
        return stringBuilder.toString();
    }


    static void createLogger(){
        logger = Logger.getAnonymousLogger();
        FileHandler fh = null;
        try {
            fh = new FileHandler("src/log.txt", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fh);
    }

    static void closeLog(){
        Handler[] handler = logger.getHandlers();
        for (int i = 0; i < handler.length; i++) {
            handler[i].close();
        }
    }

}
