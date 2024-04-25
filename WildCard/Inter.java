// //upper bound   <? extends Number>
// //lower bound   <? super Integer>
// import java.util.*;
// //arrayList //List
// public class Animal {
//     public void eat()
//     {
//         System.out.println("Animaml is eating $$$$$$$$");
//     }
// }
// class Dog extends Animal
// {
    
//     public void eat()
//     {
//         System.out.println("Dog is eating-------- ");
//     }
// }
// class Rat
// {
//     public void eat(){
//         System.out.println("Cat is Eating ******");
//     }
// }
// class Cat extends Animal{
//     @Override
//     public void eat()
//     {
//         System.out.println("Cat is eating ()()()(())");
//     }
// }

// public class Inter
// {
//     public static void feedAnimal(List<? extends Animal> Ola)
//     {
//         for(Animal gola:Ola)
//         {
//             gola.eat();
//         }
//     }
//     public static void main(String [] args)
//     {
//         List<Dog> dogs=new ArrayList<>();

//         dogs.add(new Dog());
//         dogs.add(new Dog());


//         List<Cat> cat=new ArrayList<>();

//         cat.add(new Cat());
//         cat.add(new Cat());

//         List<Rat> rat=new ArrayList<>();
//         rat.add(new Rat() );

//        // feedAnimal(rat);
//         feedAnimal(dogs);
//         feedAnimal(cat);
//     }
// }
import java.util.*;

 class Animal {
    public void eat() {
        System.out.println("Animal is eating $$$$$$$$");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating-------- ");
    }
}

class Rat extends Animal {
    @Override
    public void eat() {
        System.out.println("Rat is Eating ******");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating ()()()(())");
    }
}

public class Inter {
    public static void feedAnimal(List<? extends Animal> Ola) {
        for (Animal gola : Ola) {
            gola.eat();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cat = new ArrayList<>();
        cat.add(new Cat());
        cat.add(new Cat());

        List<Rat> rat = new ArrayList<>();
        rat.add(new Rat());

        feedAnimal(dogs);
        feedAnimal(cat);
        feedAnimal(rat);
    }
}