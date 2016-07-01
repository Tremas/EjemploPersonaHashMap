package persona;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by professor on 29/06/2016.
 */
public class OrdenarPersonas {
    private static ListMultimap<Integer, Persona> multimap = ArrayListMultimap.create();
    public static void main(String[] args) {
        Persona persona4 = new Persona(4L,"444444444A","kino",21);
        Persona persona1 = new Persona(1L,"11111111A","roberto",18);
        Persona persona2 = new Persona(2L,"22222222A","ruki",18);
        Persona persona3 = new Persona(3L,"33333333A","kiko",20);
        Persona persona5 = new Persona(5L,"555555555A","pipo",22);
        List<Persona> ListPersona = new ArrayList<>();

        ListPersona.add(persona3);
        ListPersona.add(persona4);
        ListPersona.add(persona5);
        ListPersona.add(persona1);
        ListPersona.add(persona2);


        for (Persona persona: ListPersona) {
            System.out.println(persona);

        }

        Collections.sort(ListPersona);
        for (Persona persona: ListPersona) {
            System.out.println(persona);

        }
        System.out.println("------------------------------------------------");
        //ListPersona.sort();
        //for (Coche coche : US_PRESIDENTS_IN_ORDER) {
        multimap.put(persona4.getEdad(), persona4);
        multimap.put(persona1.getEdad(), persona1);
        multimap.put(persona2.getEdad(), persona2);
        multimap.put(persona3.getEdad(), persona3);

        multimap.put(persona5.getEdad(), persona5);
        //}
        for (Integer Edad : multimap.keySet()) {
            List<Persona> persones = multimap.get(Edad);
            System.out.println(Edad + ": " + persones);
        }
    }
}
