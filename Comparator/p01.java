

import java.util.*;

class Student {
    String name, add;
    int roll;

    public Student(int roll, String n, String add) {
        this.roll = roll;
        this.name = n;
        this.add = add;
    }

    public String toString() {
        return "roll : " + roll + " Name : " + name + "  Address : " + add;
    }
}

class RRoll implements Comparator<Student> {
    // Sorting in ascending order based on roll number
    @Override
    public int compare(Student s1, Student s2) {
        return s1.roll - s2.roll;
    }
}

class NName implements Comparator<Student> {
    // Sorting in alphabetical order based on name
    public int compare(Student n1, Student n2) {
        return n1.name.compareTo(n2.name);
    }
}

public class p01 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", "Goa"));
        al.add(new Student(106, "Ajay", "Delhi"));
        al.add(new Student(105, "Jai", "Hyd"));
        al.add(new Student(107, "LOAAi", "Moan"));
        al.add(new Student(102, "oOi", "Lola"));

        System.out.println("Unsorted");
        for (Student st : al) {
            System.out.println(st);
        }

        // Collections.sort(al, new RRoll());
        Collections.sort(al, new NName());

        System.out.println("Sorted");
        for (Student st : al) {
            System.out.println(st);
        }
    }
}
