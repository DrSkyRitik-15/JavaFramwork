import java.util.HashMap;
import java.util.Map;
public class Hash {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "AA");
        map.put(1, "BB");
        map.put(1, "CC");
        map.put(1, "DD");

        System.out.println(map);
    }
}
