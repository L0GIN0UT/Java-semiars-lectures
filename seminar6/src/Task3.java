import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {

        Set<Cat> set = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.age = 12;
        cat1.name = "Barsic";
        cat1.nameOwner = "Vladimir";
        cat1.poroda = "Vislouhaya";

        Cat cat2 = new Cat();
        cat2.age = 10;
        cat2.name = "Masha";
        cat2.nameOwner = "Victor";
        cat2.poroda = "Dvornyaga";

        Cat cat3 = new Cat();
        cat3.age = 12;
        cat3.name = "Barsic";
        cat3.nameOwner = "Vladimir";
        cat3.poroda = "Vislouhaya";

        Cat cat4 = new Cat();
        cat4.age = 1;
        cat4.name = "ava";
        cat4.nameOwner = "djfsf";
        cat4.poroda = "sfd";

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);

        printSet(set);
        System.out.println(cat1.equals(cat3));
        findCat(set,7);
    }

    static void findCat(Set<Cat> cats, int minage) {
        for(Cat cat : cats){
            if(cat.age > minage){
                System.out.println(cat);
            }
        }
    }

    static void printSet(Set<Cat> set) {
        for(Cat cat : set){
            System.out.println(cat);
        }
    }
}
