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


        System.out.print("Size () => ");
        System.out.println(map.size());
        
        System.out.print("get() 1 => ");
        System.out.println(map.get(1));

        System.out.print("remove() => ");
        System.out.println(map.remove(1));
        System.out.println(map);


        for(Map.Entry<Integer,String> e:map.entrySet())
        {
            System.out.print("Key: "+e.getKey());
            System.out.println(" Value: "+e.getValue());
        }
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("DD"));
       
    }
}
