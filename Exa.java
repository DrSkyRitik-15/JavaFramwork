// class Bank<T extends Number>  //Number  is class Superclass or Parent 
// {
//     public void display(T [] t)
//     {
//         for(T j:t)
//         {
//             System.out.println(j+" ");
//         }
//     }
// }                                            
// public class Exa
// {
//     public static void main(String[] args) {
//         Bank<Number> b1=new Bank<>();
//         Integer []m1={10,20,30};
//         Double []m2={20.15,56.6,85.2};
//         System.out.println("Integer  ");
//         b1.display(m1);
//         System.out.println("Double think");
//         b1.display(m2);
//     }
// }
class Bank<T extends Number>  //Number  is class Superclass or Parent 
{
    public void display(T [] t)
    {
        for(T j:t)
        {
            System.out.println(j+" ");
        }
    }
}
public class Exa
{
    public static void main(String[] args) {
        Bank<Integer> b1=new Bank<>();      // ==================================================Number to  Integer
        Integer []m1={10,20,30};
        Double []m2={20.15,56.6,85.2};
        System.out.println("== == == =====Integer=====  == == ==");
        b1.display(m1);
        // System.out.println("Double think");
        // b1.display(m2);
    }
}