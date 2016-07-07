package persona.socialnetwork;

import com.google.common.collect.*;
import com.sun.deploy.util.OrderedHashSet;
import com.sun.xml.internal.ws.model.RuntimeModelerException;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

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
    private Multimap<Integer,Set<Persona>> amigosSortedNumFriends = TreeMultimap.create(Ordering.natural().reverse(),Ordering.allEqual());
    public void addPersona(Persona persona){
        if(genteByID.containsKey(persona.getId())||genteByID.containsValue(persona)){
            System.out.println("La id de  "+ persona.getNombre()+" ya esta introducida");
            throw new RuntimeException("La id de \"+ persona.getNombre()+\" ya esta introducida");

        }else  if(genteByNombre.containsKey(persona.getNombre())||genteByNombre.containsValue(persona)){
            System.out.println("El nombre de "+ persona.getNombre()+" ya esta introducido");
            throw new RuntimeException("El nombre de \"+ persona.getNombre()+\" ya esta introducido");
        }

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
        CheckPareja(p1);
        CheckPareja(p2);
        //pareja.values().contains(p1);
        pareja.put(p1,p2);

    }

    private void CheckPareja(Persona p1) {
        if(pareja.containsKey(p1)||pareja.values().contains(p1)){
            System.out.println("La persona "+ p1.getNombre()+" ya tiene pareja");
            throw new RuntimeException("La persona "+ p1.getNombre()+" ya tiene pareja");
        }
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

            amigos.put(p1, p2);

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
       Set<Persona> gAmigos=getAmigos(p1);
        Set<Persona> pTree= new TreeSet<>();
        // Persona p2= getPareja(p1);
        for (Persona p2: gAmigos) {
            Persona ParejaDeAmigosObjectt= getPareja(p2);
            pTree.add(ParejaDeAmigosObjectt);
        }
//
        return pTree;
    }

    public void numeroDeAmigos(){

        for (Persona p1: amigos.keySet()) {
            if(getAmigos(p1).size()==1){
                System.out.println(p1.getNombre()+" tiene "+getAmigos(p1).size()+" amigos\nQue es:\n"+getAmigos(p1));
            }else{ System.out.println(p1.getNombre()+" tiene "+getAmigos(p1).size()+" amigos\nQue son:\n"+getAmigos(p1));

            }

        }
    }
    public void numeroDeAmigosOrdenado(){

       /* Set<Persona> personasPopulares = new TreeSet<>(new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona t1) {
                Integer num1=getAmigos(persona).size();
                Integer num2=getAmigos(t1).size();

                return num2.compareTo(num1);
            }
        });*/
        List<Persona> personasPopulares = new ArrayList<>();
        Map<Persona,Integer> contAmigos= new HashMap<>();

        for (Persona p1: amigos.keySet()) {
             personasPopulares.add(p1);
            contAmigos.put(p1,getAmigos(p1).size());
        }
        Collections.sort(personasPopulares,new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona t1) {
                Integer num1=getAmigos(persona).size();
                Integer num2=getAmigos(t1).size();

                return num2.compareTo(num1);
            }
        }) ;

        System.out.println(contAmigos);
        System.out.println(personasPopulares);
       /* System.out.println (Collections.sort(personasPopulares,new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona t1) {
                Integer num1=getAmigos(persona).size();
                Integer num2=getAmigos(t1).size();

                return num2.compareTo(num1);
            }
        }) );*/


       /*for (Persona p1: amigos.keySet()) {
           // for (Persona p2: amigos.keySet()) {
                amigosSortedNumFriends.put(""+getAmigos(p1).size()+" "+p1.getNombre(),getAmigos(p1));

           // }
        }*/

        //System.out.println(amigosSortedNumFriends);
    }

    public Set<Persona>getGentePopular(Persona persona){return  null;}// devuileva de mayor a menos al gente ke tenga mas amigos
    public int getConexionGrado(Persona p1,Persona p2){
        Map<Persona,Boolean> personaVisitada=new HashMap<>();
        Queue<Persona> colaAmigos= new LinkedList<>();
        /*1.-Recorrer amigos de la persona, añadir a la cola,esos amigos, por cada amigo que comprobemos, añadirlo al hashmap
        * 2.-Despues de recorrer los amigos si no se encotrado, los amigos estan en una cola cojemos el primero en la cola  i buscamos sus amigos  i emepzamo como en el paso 1
        * 3.- saldra del buccle si lo encunetra  o no , tiene que haber una comprobacion si de si el amigo esta en amigo visitados para que no se haga un bucle infinito
        *
        * */
        boolean trobat= false;
        personaVisitada.put(p1,true);
        Set<Persona> gAmigos=getAmigos(p1);

        for (Persona amigo: gAmigos) {
            colaAmigos.offer(amigo);

        }
        while(trobat==false){
           bucle:
            while (true) {

                /*if(personaVisitada.get(colaAmigos.peek())){
                    colaAmigos.poll();continue bucle;
                }*/

                for (Persona personavisited : personaVisitada.keySet()) {
                    if (colaAmigos.peek().equals(personavisited)) {
                        colaAmigos.poll();
                        continue bucle;
                    }

                }
                break bucle;
            }
            if(colaAmigos.peek().equals(p2)){
                trobat=true;

                return 1;

            }
            Persona nextPerson=colaAmigos.peek();
            if(nextPerson!=null) {
                Set<Persona> amigoDeAmigo = getAmigos(nextPerson);

                for (Persona amigo1 : amigoDeAmigo) {
                    colaAmigos.offer(amigo1);

                }
            }
            personaVisitada.put(nextPerson,true);
            if(colaAmigos.poll()==null){
                return 0;

            }
        }






        return 0;}
    public SortedSet<Persona>getGradoConexion(Persona p1,Persona p2){return  null;}
}
