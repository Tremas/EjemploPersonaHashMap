package persona.socialnetwork;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
//import com.google.common.collect.Multimap;
import com.google.common.collect.*;
import persona.StringComparable;

import java.util.*;

/**
 * Created by professor on 04/07/2016.
 */
public class mainExercici {
    private static List<Persona> personaList= new ArrayList<>();
    //private static Map<String,Persona> gente = new HashMap<>();
    //private static BiMap<Persona,Persona> pareja = HashBiMap.create();
    //private static Multimap<Persona,Persona> amigos = ArrayListMultimap.create();
    public static void main(String[] args) {

        Persona cristina = new Persona(1L,"Cristina","Duran");
        Persona pedro = new Persona(2L,"Pedro","González");
        Persona juan = new Persona(3L,"Juan","Martínez");
        Persona julia = new Persona(4L,"Julia","Cinca");
        Persona carol = new Persona(5L,"Carol","Salvador");
        Persona ana = new Persona(6L,"Ana","Gómez");
        Persona antonio = new Persona(7L,"Antonio","Martínez");
        Persona marc = new Persona(8L,"Marc","Bernadi");
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.addPersona(cristina);
        socialNetwork.addPersona(pedro);
        socialNetwork.addPersona(juan);
        socialNetwork.addPersona(julia);
        socialNetwork.addPersona(carol);
        socialNetwork.addPersona(ana);
        socialNetwork.addPersona(antonio);
        socialNetwork.addPersona(marc);
        socialNetwork.addPareja(cristina,juan);
        socialNetwork.addPareja(antonio,pedro);
        socialNetwork.addPareja(ana,marc);
        socialNetwork.addAmigo(cristina,pedro);
        socialNetwork.addAmigo(pedro,julia);
        socialNetwork.addAmigo(julia,carol);
        socialNetwork.addAmigo(julia,ana);
        socialNetwork.addAmigo(ana,antonio);
        socialNetwork.addAmigo(antonio,marc);
        socialNetwork.addAmigo(antonio,juan);
        socialNetwork.addAmigo(marc,juan);

        //socialNetwork.getAmigos(cristina);
        System.out.println("1--------------------------------");
        System.out.println(socialNetwork.getPareja(socialNetwork.getPersona("Marc")));
        System.out.println("2-----------------------------------");
        //for (Persona p1: socialNetwork.getAmigos(socialNetwork.getPersona(2L))) {
            System.out.println(socialNetwork.getAmigos(socialNetwork.getPersona("Marc")));
        System.out.println("3---------------------------------");
        System.out.println(socialNetwork.getParejaDeAmigos(socialNetwork.getPersona("Marc")));
       // }
       /* gente.put(cristina.getNombre(),cristina);
        gente.put(pedro.getNombre(),pedro);
        gente.put(juan.getNombre(),juan);
        gente.put(julia.getNombre(),julia);
        gente.put(carol.getNombre(),carol);
        gente.put(ana.getNombre(),ana);
        gente.put(antonio.getNombre(),antonio);
        gente.put(marc.getNombre(),marc);

*/

       /* pareja.put(cristina,juan);
        pareja.put(antonio,pedro);
        pareja.put(ana,marc);*/
       // System.out.println("Pareja:\n"+pareja);
       /* System.out.println("La pareja de cristina: "+pareja.get(cristina));
        System.out.println("La pareja de Juan: "+pareja.inverse().get(juan));*/
        //devolverPareja();
        // System.out.println(p1);




        //System.out.println("-------------------------------------");
       /* amigos.put(cristina,pedro);
        amigos.put(pedro,cristina);
        amigos.put(pedro,julia);
        amigos.put(julia,pedro);
        amigos.put(julia,carol);
        amigos.put(julia,ana);
        amigos.put(antonio,ana);
        amigos.put(juan,marc);
        amigos.put(juan,antonio);
        amigos.put(antonio,marc);*/
       //System.out.println("Los amigos de Julia son :"+ amigos.get(julia)+amigos.ImmutableMultimap.(julia));
    }
    private static void devolverPareja(){
       /* Persona p1= null;
        while (p1==null) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introdue el nombre de la persona(La primera letra en mayúscula)\n");
            String persona = scan.next();
            p1 = gente.get(persona);
        }
       // return p1;
        if (pareja.get(p1) != null) {
            // System.out.println("No inverse");
            System.out.println("La pareja de " + p1.getNombre() + " es: " + pareja.get(p1));
        } else if(pareja.inverse().get(p1)!=null) {
            //System.out.println("Inverse");

            System.out.println("La pareja de " + p1.getNombre() + " es: " + pareja.inverse().get(p1));

        }else{
            System.out.println(p1.getNombre()+" no tiene pareja");
        }*/
    }
}