package SER;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Serialization implements Serializable {

    Serialization() throws IOException {
        List<Person> p = new ArrayList<>();
        p.add(new Person("sigrun", 45));
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
          out.writeObject(p);
          out.flush();
          System.out.println("Success");
}
}
