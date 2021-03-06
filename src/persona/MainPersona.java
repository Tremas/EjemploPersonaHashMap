package persona;

import java.util.*;

import static javafx.application.Platform.exit;

/**
 * Created by professor on 28/06/2016.
 */
public class MainPersona {
    private static Map<Long,Persona> mapIdPersona= new TreeMap<>();//ordenado
    private static Map<String,Persona> mapNombrePersona= new HashMap<>();
    private static Map<String,Persona> mapDniPersona= new HashMap<>();
    private static Map<Integer,List<Persona>> mapEdadPersona= new HashMap<>();
    private static Map<String,List<Persona>> mapNombreRepePersona= new HashMap<>();//<-- si pongo treemap se pone ordenado alfabeticametne

    public static void main(String[] args) {

        CreatePersonas();
        Scanner scan = new Scanner(System.in);
        loop:
        while(true) {
            System.out.println("Seleciona una opcion:\n1.- Buscar por ID\n2.- Buscar por Nombre\n3.- Buscar por DNI\n4.- Buscar por Edad\n5.- Buscar nombre repe\n6.- Buscar Nombre Keys\n7.- Buscar Id Keys\n8.- Mostrar Keys Nombres\n9.- Mostrar todos\n10.- Salir");
            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    BuscarID();
                    break;
                case 2:
                    BuscarNombre();
                    break;
                case 3:
                    BuscarDni();
                    break;
                case 4:
                    BuscarEdad();
                    break;
                case 5:
                    BuscarNombreRepe();
                    break;
                case 6:
                    MostrarNombreKeys();
                    break;
                case 7:
                    MostrarIdKeys();
                    break;
                case 8:
                    MostrarNombreRepeKeys();
                    break;
                case 9:
                    MostarAllPeronasById();
                    break;
                case 10:
                    System.exit(0);
                    break;
                case 11:
                    MostrarPersonaNoRepe();
                    break;
                case 12:
                    for(String NombrePersona : mapNombreRepePersona.keySet() ){
                        System.out.println("Nombre persona "+NombrePersona);
                        List<Persona> personaActual = mapNombreRepePersona.get(NombrePersona);
                        System.out.println("La persona es:"+personaActual);
                    }
                default:

                    break loop;
            }

        }

    }

    private static void MostrarPersonaNoRepe() {
        for(String NombrePersona : mapNombrePersona.keySet() ){
            System.out.println("Nombre persona "+NombrePersona);
            Persona personaActual = mapNombrePersona.get(NombrePersona);
            System.out.println("La persona es:"+personaActual);
        }
    }

    private static void MostarAllPeronasById() {
        for(Long idPersona : mapIdPersona.keySet() ){
            System.out.println("Id persona "+idPersona);
            Persona personaActual = mapIdPersona.get(idPersona);
            System.out.println("La persona es:"+personaActual);
        }
    }

    private static void MostrarIdKeys() {
        for ( Long idPersona : mapIdPersona.keySet() ) {
            System.out.println( idPersona );
        }
    }

    private static void MostrarNombreKeys() {
        for ( String nombrePersona : mapNombrePersona.keySet() ) {
            System.out.println( nombrePersona );
        }
    }
    private static void MostrarNombreRepeKeys() {
        for ( String nombreRepePersona : mapNombreRepePersona.keySet() ) {
            System.out.println( nombreRepePersona );
        }
    }

    private static void BuscarID() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Buscar persona por id \nIntroduce la Id:");
        Long id=scan.nextLong();
        if(mapIdPersona.containsKey(id)){ System.out.println("Usuario "+mapIdPersona.get(id));}else{
            System.out.println("Id introducida es incorrecta");

        }
    }
    private static void BuscarNombre() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Buscar persona por Nombre \nIntroduce el Nombre:");
        String nom=scan.next();
        if(mapNombrePersona.containsKey(nom)){ System.out.println("Usuario "+mapNombrePersona.get(nom));}else{
            System.out.println("Nombre introducida es incorrecta");

        }
    }
    private static void BuscarNombreRepe() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Buscar persona por Nombre \nIntroduce el Nombre:");
        String nom=scan.next();
        if(mapNombreRepePersona.containsKey(nom)){ System.out.println("Usuario "+mapNombreRepePersona.get(nom));}else{
            System.out.println("Nombre introducida es incorrecta");

        }
    }
    private static void BuscarDni() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Buscar persona por DNI \nIntroduce el DNI:");
        String dni=scan.next();
        if(mapDniPersona.containsKey(dni)){ System.out.println("Usuario "+mapDniPersona.get(dni));}else{
            System.out.println("Dni introducida es incorrecta");

        }
    }
    private static void BuscarEdad() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Buscar persona por Edad \nIntroduce la Edad:");
        int edad=scan.nextInt();
        if(mapEdadPersona.containsKey(edad)){ System.out.println("Usuario "+mapEdadPersona.get(edad));}else{
            System.out.println("Edad introducida es incorrecta");

        }
    }
    private static void CreatePersonas() {
        Persona persona1 = new Persona(1L,"11111111A","roberto",18);
        mapIdPersona.put(persona1.getId(),persona1);
        mapDniPersona.put(persona1.getDni(),persona1);
        mapNombrePersona.put(persona1.getNom(),persona1);
        PersonaEdad(persona1);
        PersonaNombre(persona1);

        Persona persona2 = new Persona(2L,"22222222A","ruki",18);
        mapIdPersona.put(persona2.getId(),persona2);
        mapDniPersona.put(persona2.getDni(),persona2);
        mapNombrePersona.put(persona2.getNom(),persona2);
        PersonaEdad(persona2);
        PersonaNombre(persona2);

        Persona persona3 = new Persona(3L,"33333333A","kiko",20);
        mapIdPersona.put(persona3.getId(),persona3);
        mapDniPersona.put(persona3.getDni(),persona3);
        mapNombrePersona.put(persona3.getNom(),persona3);
        PersonaEdad(persona3);
        PersonaNombre(persona3);

        Persona persona4 = new Persona(4L,"444444444A","kino",21);
        mapIdPersona.put(persona4.getId(),persona4);
        mapDniPersona.put(persona4.getDni(),persona4);
        mapNombrePersona.put(persona4.getNom(),persona4);
        PersonaEdad(persona4);
        PersonaNombre(persona4);

        Persona persona5 = new Persona(5L,"555555555A","pipo",22);
        mapIdPersona.put(persona5.getId(),persona5);
        mapDniPersona.put(persona5.getDni(),persona5);
        mapNombrePersona.put(persona5.getNom(),persona5);
        PersonaEdad(persona5);
        PersonaNombre(persona5);

        Persona persona6 = new Persona(6L,"666666666A","tuhar",23);
        mapIdPersona.put(persona6.getId(),persona6);
        mapDniPersona.put(persona6.getDni(),persona6);
        mapNombrePersona.put(persona6.getNom(),persona6);
        PersonaEdad(persona6);
        PersonaNombre(persona6);

        Persona persona7 = new Persona(7L,"777777777A","kino",24);
        mapIdPersona.put(persona7.getId(),persona7);
        mapDniPersona.put(persona7.getDni(),persona7);
        mapNombrePersona.put(persona7.getNom(),persona7);
        PersonaEdad(persona7);
        PersonaNombre(persona7);

        Persona persona8 = new Persona(8L,"888888888A","lupin",25);
        mapIdPersona.put(persona8.getId(),persona8);
        mapDniPersona.put(persona8.getDni(),persona8);
        mapNombrePersona.put(persona8.getNom(),persona8);
        PersonaEdad(persona8);
        PersonaNombre(persona8);

        Persona persona9 = new Persona(9L,"999999999A","sis",26);
        mapIdPersona.put(persona9.getId(),persona9);
        mapDniPersona.put(persona9.getDni(),persona9);
        mapNombrePersona.put(persona9.getNom(),persona9);
        PersonaEdad(persona9);
        PersonaNombre(persona9);

        Persona persona10 = new Persona(10L,"101010101A","mr.Bean",27);
        mapIdPersona.put(persona10.getId(),persona10);
        mapDniPersona.put(persona10.getDni(),persona10);
        mapNombrePersona.put(persona10.getNom(),persona10);
        PersonaEdad(persona10);
        PersonaNombre(persona10);
    }

    private static void PersonaEdad(Persona persona) {
        if(!mapEdadPersona.containsKey(persona.getEdad())){
            List<Persona> personaList=new ArrayList<>();
            mapEdadPersona.put(persona.getEdad(),personaList);
        }
        List<Persona> personaList=mapEdadPersona.get(persona.getEdad());
        personaList.add(persona);
    }

    private static void PersonaNombre(Persona persona) {
        if(!mapNombreRepePersona.containsKey(persona.getNom())){
            List<Persona> personaNomList=new ArrayList<>();
            mapNombreRepePersona.put(persona.getNom(),personaNomList);
        }
        List<Persona> personaNomList=mapNombreRepePersona.get(persona.getNom());
        personaNomList.add(persona);
    }


}
