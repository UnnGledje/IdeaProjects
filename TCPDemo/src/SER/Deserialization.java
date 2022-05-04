package SER;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Deserialization implements Serializable {

    public Deserialization() throws IOException, ClassNotFoundException {
       // List<People> p;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        List<Person> p = (List<Person>) in.readObject();

        p.forEach( x -> System.out.println(x.getName()));
        System.out.println(p);

        in.close();
       // return p;
    }

}
