package PhoneBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Database {
    List<Kompis> kompis = new ArrayList<>();
    Database() {


        Kompis k1 = new Kompis("Oscar" , "Sweden", "111111");
        Kompis k2 = new Kompis("Orre" , "Svedala", "222222");
        Kompis k3 = new Kompis("Ozzy" , "Systemet", "333333");
        Kompis k4 = new Kompis("Oscaria" , "Swedalaland", "444444");
        Kompis k5 = new Kompis("Osur" , "Switzerland", "555555");

        //Collections.addAll(kompis, k1,k2,k3,k4,k5);
        kompis.add(k1);
        kompis.add(k2);
        kompis.add(k3);
        kompis.add(k4);
        kompis.add(k5);

       // kompis = Arrays.asList(k1,k3 ,k2, k4, k5);

    }
}
