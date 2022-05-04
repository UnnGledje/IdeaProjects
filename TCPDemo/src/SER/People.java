package SER;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class People implements Serializable {
    public List<Person> people = new ArrayList<>();

    People() {
        Person p1 = new Person("Unn", 32);
        Person p2 = new Person("Lynn", 31);
        Person p3 = new Person("Odd", 27);
        Person p4 = new Person("Kerstin", 62);
        Person p5 = new Person("Karsten", 73);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        List<Person> p = new ArrayList<>();
    }
}

