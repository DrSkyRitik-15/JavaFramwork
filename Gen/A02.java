class print<T> {
    T a;

    public void fun(T obj) {
        a = obj;

        System.out.println("The print single method => " + a);

    }
}

/**
 * A02
 */
public class A02 {
    public static void main(String[] args) {
        System.out.println("===============================");
        
        print<Integer> obj = new print<>();
        obj.fun(10);
        System.out.println("===============================");
        

        print<String> obj1 = new print<>();

        obj1.fun("Hello");
        System.out.println("===============================");
        

        print<Double> obj2 = new print<>();

        obj2.fun(10.5);
        System.out.println("===============================");
        

        print<Character> obj3 = new print<>();

        obj3.fun('A');
        System.out.println("===============================");
        

        print<Boolean> obj4 = new print<>();

        obj4.fun(true);
    }

}