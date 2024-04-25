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

class Wildbound {
public static void feedAnimal(List<? super Dog> Ola) {
for (Object goal : Ola) {
((Animal) goal).eat();
}
}

public static void main(String[] args) {
List<Dog> dogs = new ArrayList<>();
dogs.add(new Dog());
dogs.add(new Dog());

List<Cat> cat = new ArrayList<>();
cat.add(new Cat());
cat.add(new Cat());

List<Animal> ani = new ArrayList<>();
ani.add(new Animal());

feedAnimal(dogs);
// feedAnimal(cat);     kyu ki Super classs Dog hai esi liyeca
feedAnimal(ani);
}
}

// import java.util.*;
// class Animal {
// public void eat() {
// // Empty implementation
// }
// }

// class Dog extends Animal {
// @Override
// public void eat() {
// System.out.println("Dog is eating-------- ");
// }
// }

// class Cat extends Animal {
// @Override
// public void eat() {
// System.out.println("Cat is eating ()()()(())");
// }
// }

// class Wildbound {
// public static void feedAnimal(List<? super Dog> animals) {
// for (Object animal : animals) {
// ((Animal) animal).eat();
// }
// }

// public static void main(String[] args) {
// List<Dog> dogs = new ArrayList<>();
// dogs.add(new Dog());
// dogs.add(new Dog());

// List<Cat> cats = new ArrayList<>();
// cats.add(new Cat());
// cats.add(new Cat());

// List<Animal> animals = new ArrayList<>();
// animals.add(new Animal());

// feedAnimal(dogs);
// //feedAnimal(cats);
// feedAnimal(animals);
// }
// }