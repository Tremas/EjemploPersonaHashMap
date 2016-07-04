package Coche;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.*;

/**
 * Created by professor on 29/06/2016.
 */
public class mainCoche {
    //private static Map<Long,Coche> mapIdPersona= new TreeSet<Coche>();//ordenado
    private static Set<Coche> setCoche = new TreeSet<Coche>(new AnyComp());
    private static PriorityQueue<Coche> cochePriorityQueue = new PriorityQueue<>(new AnyComp());
    private static ListMultimap<Integer, Coche> multimap = ArrayListMultimap.create();
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
        System.out.println("muestro el array list desordenado");
        for (Coche coche: listCoche) {
            System.out.println(coche);

        }
        System.out.println("------------------------------------------------");
        Collections.sort(listCoche);
        System.out.println("muestro el array list ordenado");
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
        System.out.println("muestro el set");
        //System.out.println(setCoche);
        System.out.println("------------------------------------------------");
        for (Coche coche: setCoche) {
            System.out.println(coche);

        }
        System.out.println("------------------------------------------------");

        System.out.println("meustro el priority queue");
        cochePriorityQueue.add(c1);
        cochePriorityQueue.add(c2);
        cochePriorityQueue.add(c3);
        cochePriorityQueue.add(c4);
        cochePriorityQueue.add(c5);


      /*  Coche c= cochePriorityQueue.poll();

        while(c!=null){

            System.out.println(c);
            c= cochePriorityQueue.poll();
        }*/


        for (Coche coche: cochePriorityQueue) {
            System.out.println(coche);

        }
        //for (Coche coche : US_PRESIDENTS_IN_ORDER) {
       /*     multimap.put(c1.getEdad(), c1);
        multimap.put(c1.getId(), c1);
        multimap.put(c1.getId(), c1);
        multimap.put(c1.getId(), c1);
        //}
        for (String firstName : multimap.keySet()) {
            List<String> lastNames = multimap.get(firstName);
            System.out.println(firstName + ": " + lastNames);
        }*/
    }
}

//programa que te agrupe todos los poliedros agurpados por su color