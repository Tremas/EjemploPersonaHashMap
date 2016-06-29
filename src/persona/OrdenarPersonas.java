package persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by professor on 29/06/2016.
 */
public class OrdenarPersonas {

    public static void main(String[] args) {
        Persona persona1 = new Persona(1L,"11111111A","roberto",18);
        Persona persona2 = new Persona(2L,"22222222A","ruki",18);
        Persona persona3 = new Persona(3L,"33333333A","kiko",20);
        Persona persona4 = new Persona(4L,"444444444A","kino",21);
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
        //ListPersona.sort();

    }
}
