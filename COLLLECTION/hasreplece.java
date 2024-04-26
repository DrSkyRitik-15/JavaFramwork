import java.util.HashMap;
import java.util.Map;
public class hasreplece {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "AA");
        map.put(2, "BB");
        map.put(3, "CC");
        map.put(4, "DD");

        System.out.println(map);

        System.out.println("Replace the value => ");
        map.replace(1, "AAaA");
        System.out.println(map);
    }
}
