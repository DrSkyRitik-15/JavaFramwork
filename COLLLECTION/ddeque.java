
import java.util.*;
public class ddeque {
    public static void main(String[] args) {
        ArrayDeque<String> Goal=new ArrayDeque<>();

        Goal.add("A");
        Goal.add("B");
        Goal.add("C");
        Goal.add("D");

        System.out.println(Goal);


        Goal.remove();
        System.out.println(Goal);
    }
}
