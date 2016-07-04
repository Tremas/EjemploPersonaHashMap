package persona.socialnetwork;

import com.google.common.collect.*;
import com.sun.deploy.util.OrderedHashSet;

import java.util.*;

/**
 * Created by professor on 04/07/2016.
 */
public class SocialNetwork {
    private Map<String,Persona> genteByNombre = new HashMap<>();
    private Map<Long,Persona> genteByID = new HashMap<>();
    private BiMap<Persona,Persona> pareja = HashBiMap.create();
   // private Multimap<Persona,Persona> amigos = ArrayListMultimap.create();
    private Multimap<Persona,Persona> amigos = TreeMultimap.create();
    public void addPersona(Persona persona){
        genteByNombre.put(persona.getNombre(),persona);
        genteByID.put(persona.getId(),persona);

    }
    public Persona getPersona(Long id){
       // gente.get(id);
        return genteByID.get(id);
    }//demomento  1 persona pero tendria que devoler un lsitado
    public Persona getPersona(String nombre){

        return  genteByNombre.get(nombre);}
    public void addPareja(Persona p1,Persona p2){
    pareja.put(p1,p2);

    }

    public Persona getPareja(Persona p1){
        if (pareja.get(p1) != null) {
            // System.out.println("No inverse");
            //System.out.println("La pareja de " + p1.getNombre() + " es: " + pareja.get(p1));
            return pareja.get(p1);
        } else if(pareja.inverse().get(p1)!=null) {
            //System.out.println("Inverse");

           // System.out.println("La pareja de " + p1.getNombre() + " es: " + pareja.inverse().get(p1));
            return pareja.inverse().get(p1);
        }else{
            System.out.println(p1.getNombre()+" no tiene pareja");
            return null;
        }
    }
    public void addAmigo(Persona p1,Persona p2){
        amigos.put(p1,p2);
        amigos.put(p2,p1);

    }
    public Set<Persona> getAmigos(Persona p1){
        Set<Persona> pSet = new TreeSet<>(amigos.get(p1));
        return pSet;
    }//Ponemos Set en vez de List para que no aya repetidos
    public Set<Persona> getAmigosDePareja(Persona p1){
        Set<Persona> amigosParejaSet = new TreeSet<Persona>(amigos.get(getPareja(p1)));
        return amigosParejaSet;
    }
    public Set<Persona> getParejaDeAmigos(Persona p1){
        Persona p2= getPareja(p1);

        Set<Persona> ParejaDeAmigosSet= getAmigos(p2);
        return  ParejaDeAmigosSet;
    }

    public void numeroDeAmigos(){}

    public Set<Persona>getGentePopular(Persona persona){return  null;}// devuileva de mayor a menos al gente ke tenga mas amigos
    public int getConexionGrado(Persona p1,Persona p2){return 0;}
    public SortedSet<Persona>getGradoConexion(Persona p1,Persona p2){return  null;}
}
