class Doublevalue<T,U>
{
    T a;
    U b;

    //Construc
    Doublevalue(T a,U b)
    {
        this .a = a;
        this.b = b;
    }
    //Corrected constructor
    public void print()
    {
        System.out.println("The value of T => "+a);
        System.out.println("The value of U => "+b);
    }

}

 
public class A03 {
    public static void main(String[] args) {
        Doublevalue<Integer,String> obj = new Doublevalue<>(10,"Hello");
        obj.print();
    }
    
}