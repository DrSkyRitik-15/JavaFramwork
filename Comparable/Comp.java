import java.util.*;
class My implements Comparable<My>
{
    private int value;
    public My(int a)
    {
        this.value=a;
    }
    public int getValue()
    {
        return value;
    }
    @Override
    public int compareTo(My m)
    {
        return Integer.compare(this.value,m.value);
    }
}
/**
 * Comp
 */
public class Comp {

    public static void main(String[] args)
    {
        TreeSet<My> t=new TreeSet<My>();
        // TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(new My(10));
        t.add(new My(20));
        t.add(new My(50));
        t.add(new My(5));
        t.add(new My(10));
        t.add(new My(20));
        t.add(new My(50));
        t.add(new My(5));
        // t.add(2);
        // t.add(6);
        // t.add(8);
        // t.add(7);
        System.out.println("Element in Tree Set");
        for(My  m:t)
        {
            System.out.println(m.getValue());
        }


    }
}