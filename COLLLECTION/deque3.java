import java.util.*;

public class deque3 {
    public static void main(String[] args) {
        Deque<String> list = new ArrayDeque<>();

        list.add("for");
        list.addFirst("geeks");
        list.addLast("geeks");

        System.out.println(list);


        System.err.println("The size is => "+list.size());

        System.out.println("pop"+list.pop());

        System.out.println(list);

        System.out.println("poll()"+list.poll());

        System.out.println(list);

        System.out.println(list.pollFirst());
        System.out.println(list);
        

        System.out.println(list.pollLast());
        System.out.println(list);


    }
}
