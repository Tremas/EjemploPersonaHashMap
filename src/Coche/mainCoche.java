package Coche;

import java.util.*;

/**
 * Created by professor on 29/06/2016.
 */
public class mainCoche {
    //private static Map<Long,Coche> mapIdPersona= new TreeSet<Coche>();//ordenado
    private static Set<Coche> setCoche = new TreeSet<Coche>();
    public static void main(String[] args) {
        Coche c1 = new Coche(1L,"Seat","Leon",2016,"2134BBB");
        Coche c2 = new Coche(2L,"Peugeot","208",2008,"1234AAA");
        Coche c3 = new Coche(3L,"Nissan","Patrol",2004,"4321CCC");
        Coche c4 = new Coche(4L,"Seat","Toledo",2008,"1234BBB");
        Coche c5 = new Coche(5L,"Subaru","Ipreza",2016,"9999ZZZ");

        List<Coche> listCoche = new ArrayList<Coche>();
        listCoche.add(c1);
        listCoche.add(c2);
        listCoche.add(c5);
        listCoche.add(c4);
        listCoche.add(c3);

        for (Coche coche: listCoche) {
            System.out.println(coche);

        }
        System.out.println("------------------------------------------------");
        Collections.sort(listCoche);
        for (Coche coche: listCoche) {
            System.out.println(coche);

        }
        System.out.println("------------------------------------------------");
        //mapIdPersona.put()
        setCoche.add(c1);
        setCoche.add(c3);
        setCoche.add(c2);
        setCoche.add(c5);
        setCoche.add(c4);
        System.out.println(setCoche);
    }
}

