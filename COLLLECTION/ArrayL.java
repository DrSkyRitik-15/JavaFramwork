import java.util.*;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Janu");
        list.add("Ok");
        list.add("Ritik");
        list.add("A name");

        System.out.println(list);
        System.out.println("=================================================\n");



        list.add("Ola");
        System.out.println(list);
        System.out.println("===============================================\n");
        


        System.out.println("Add at Specific location =>");
        list.add(1,"Lala");
        System.out.println(list);
        System.out.println("==========================================\n");



        System.out.println("Remove at Specific location =>");
        // list.remove("Ola");
        // or
        list.remove(1);
        System.out.println(list);
        System.out.println("===============================================\n");


        
        System.out.println("Replace using (set) at Specific location =>");
        list.set(0,"Asman");
        System.out.println(list);
        System.out.println("============================================================\n");
        


        System.out.println(" (get(index)) at Specific location =>");
        System.err.println(list.get(2));
        System.out.println("============================================================\n");


        System.out.println("Delete all the Value");
        list.clear();
        System.out.println(list);
    }
}
