import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<Notebook> all = generate(1000);
        int choise = 0;
        while (choise != 8){
            choise = printForChoise();
            if(choise != 8){
                printFor(choise);
                String character = characters();
                System.out.println("Нажмите ENTER для продолжения");
                characters();
                all = sorted(all, character);
            }
        }
        if(all.isEmpty()){
            System.out.println("Нам не удалось найти ноутбук с такими хар-ми");
        }
        else {
            System.out.println("По вашему запросу удалось найти:");
            printSet(all);
        }
    }

    static Set<Notebook> generate(int amount){
        Set<Notebook> notes = new HashSet<>();
        Random rand = new Random();
        String[] companys = {"Lenovo", "Dell", "HP", "Apple", "Asus", "Acer", "Razer", "LG"};
        String[] colors = {"Red", "Green", "Blue", "Black", "White"};
        String[] resolutions = {"1366×768(HD)", "1600×900(HD+)", "1920×1080(Full HD)", "2560×1440(2K)", "3840×2160(4K или Ultra HD)"};
        String[] HDDs = {"250", "500", "1024", "2048", "4096"};
        String[] OSs = {"Windows", "MacOS", "Linux", "DOS"};
        String[] RAMs_generation = {"DDR2", "DDR3", "DDR3L", "DDR4"};
        String[] RAMs = {"2","4","8","16","32"};

        for(int i = 0; i < amount ; i++){
            Notebook notebook = new Notebook();

            notebook.company = companys[rand.nextInt(0,companys.length)];
            notebook.resolution = resolutions[rand.nextInt(0,resolutions.length)];
            notebook.color = colors[rand.nextInt(0,colors.length)];
            notebook.OS = OSs[rand.nextInt(0,OSs.length)];
            notebook.HDD = HDDs[rand.nextInt(0,HDDs.length)];
            notebook.RAM_generation = RAMs_generation[rand.nextInt(0,RAMs_generation.length)];
            notebook.RAM = RAMs[rand.nextInt(0,RAMs.length)];

            notes.add(notebook);
        }
        return notes;
    }


    static Set<Notebook> sorted(Set<Notebook> all, String scan){
        Set<Notebook> sortedAll = new HashSet<>();
        for(Notebook notebook: all){
            if(notebook.HDD.equals(scan)){
                sortedAll.add(notebook);
            } else if(notebook.RAM_generation.equals(scan)){
                sortedAll.add(notebook);
            } else if (notebook.RAM.equals(scan)){
                sortedAll.add(notebook);
            } else if (notebook.resolution.equals(scan)){
                sortedAll.add(notebook);
            } else if (notebook.color.equals(scan)) {
                sortedAll.add(notebook);
            } else if (notebook.company.equals(scan)) {
                sortedAll.add(notebook);
            } else if (notebook.OS.equals(scan)) {
                sortedAll.add(notebook);
            }
        }
        return sortedAll;
    }

    static String characters(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int printForChoise() {
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - Компания\n" +
                "2 - Цвет\n" +
                "3 - Разрешение экрана\n" +
                "4 - Объем жёсткого диска\n" +
                "5 - Операционная система\n" +
                "6 - Поколение оперативной памяти\n" +
                "7 - Объем оперативной памяти\n" +
                "8 - ПОИСК");

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите ваш выбор: ");
            int input = scanner.nextInt();
            if (input > 0 && input < 9){
                for(int i = 0; i < 15; i++) {
                    System.out.print("\n");
                }
                return input;
            }
        }
    }


    static void printFor(int choise){
        if(choise == 1){
            System.out.println("Введите интересующую вас Компанию: " +
                    "\nНапример:\n"+
                    "\"Lenovo\", \"Dell\", \"HP\", \"Apple\"\n\"Asus\", \"Acer\", \"Razer\", \"LG\"");
        }
        if(choise == 2){
            System.out.println("Введите интересующий вас Цвет: " +
                    "\nНапример:\n"+
                    "\"Red\", \"Green\", \"Blue\", \"Black\", \"White\"");
        }
        if(choise == 3){
            System.out.println("Введите интересующую вас Разрешение экрана: " +
                    "\nНапример:\n"+
                    "\"1366×768(HD)\", \"1600×900(HD+)\", \"1920×1080(Full HD)\"\n\"2560×1440(2K)\", \"3840×2160(4K или Ultra HD)\"");
        }
        if(choise == 4){
            System.out.println("Введите интересующую вас Объем жёсткого диска: " +
                    "\nНапример\n"+
                    "\"250\", \"500\", \"1024\", \"2048\", \"4096\"");
        }
        if(choise == 5){
            System.out.println("Введите интересующую вас Объем жёсткого диска: " +
                    "\nНапример\n"+
                    "\"Windows\", \"MacOS\", \"Linux\", \"DOS\"");
        }
        if(choise == 6){
            System.out.println("Введите интересующую вас Объем жёсткого диска: " +
                    "\nНапример\n"+
                    "\"DDR2\", \"DDR3\", \"DDR3L\", \"DDR4\"");
        }
        if(choise == 7){
            System.out.println("Введите интересующую вас Объем жёсткого диска: " +
                    "\nНапример\n"+
                    "\"2\",\"4\",\"8\",\"16\",\"32\"");
        }
    }

    static void printSet(Set<Notebook> set) {
        for(Notebook note : set){
            System.out.println(note);
        }
    }
}
