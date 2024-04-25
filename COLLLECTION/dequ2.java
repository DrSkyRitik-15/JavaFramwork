import java.util.*;


public class dequ2 {
    public static void main(String[] args) {
        Deque<String> list=new LinkedList<>() ;

        list.add("Element 1 (Tail)");
        list.addFirst("Element 2 (Head)");
        list.addLast("Element 3 (Tail)");

        list.push("Elemnt 4 (Head)");
        list.offer("Element 5 (Tail)");
        list.offerFirst("Element 6 (Head)");
        list.offerLast("Element 7 (Tail)");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);


        
    }
}
