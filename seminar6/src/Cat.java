public class Cat {
    String name,nameOwner,poroda;
    int age;

    public String toString() {
        return "name: " + name + " nameOwner: "+ nameOwner + " poroda: " + poroda + " age: " + age;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && nameOwner.equals(cat.nameOwner) && poroda.equals(cat.poroda) && age == cat.age;
    }

    public int hashCode() {
        return 3 * name.hashCode() + 7 * nameOwner.hashCode() + 11 * poroda.hashCode() + 13 * age;
    }
}
