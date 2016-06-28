package poliedros;

import java.util.*;


/**
 * Created by professor on 27/06/2016.
 */
public class MapColores {

    //declarar un array para los colores
    //primero pedir los colores que quiero añadir y añadirlos al array
    //segundo preguntar cuantos poliedros quiero añadir de cada tipo
    //tercero acer un bucle
    public static String colorArray[];
    public static final String ROJO = "Rojo";
    public static final String AMARILLO = "Amarillo";
    public static final String AZUL = "Azul";
   // public static final String TETAEDROOS = "Tetaedros";
   // public static final String CUBOS = "Cubos";
    //private static Map<String,List<? extends Poliedro>> mapPoliedro = new HashMap<>();
    private static Map<String,List<? extends Poliedro>> mapColoresPoliedro = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Poliedro> arrayList = new ArrayList<>();
       /* System.out.println("Introduce el numero de  poliedros para cada tipo:  ");*/
        int numero = 5; //sc.nextInt();
        System.out.println("Introduce cuantos colores quires");
        Scanner Colores= new Scanner(System.in);
        int numColores=Colores.nextInt();
        for(int i=0;i<numColores;i++) {
            System.out.println("Introduce el color ("+i+" de "+numColores+")");
            colorArray[i]=Colores.next();
        }
        System.out.println("Introduce cuantos poliedros introduciras de cada tipo");
        int numeroPoli=sc.nextInt();


       /* agregarTetaedro(sc, arrayList, numero);

        agregarHexaedro(sc, arrayList, numero);
        agregarOctaedro(sc, arrayList, numero);
        agregarDodecaedro(sc, arrayList, numero);*/
        agregarIcosaedro(sc, arrayList, numero);
        mostrarCubos();





    }

    private static void mostrarCubos(){
        System.out.println("Lista de de cubos por colores:");
        System.out.println(ROJO+":"+mapColoresPoliedro.get(ROJO));
        System.out.println(AZUL+":"+mapColoresPoliedro.get(AZUL));
        System.out.println(AMARILLO+":"+mapColoresPoliedro.get(AMARILLO));
    }


    private static void agregarIcosaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Icosaedro> cuboListRojo = new ArrayList<>();
        List<Icosaedro> cuboListAmarillo = new ArrayList<>();
        List<Icosaedro> cuboListAzul = new ArrayList<>();
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del Icosaedro "+ROJO/*(i+(numero*4))*/);
            System.out.println("Introduce la medida de la arista:");
            double arista = sc.nextDouble();
            String colorSelected=ROJO;
            //System.out.println("El color seleccionado es :"+ colorSelected);
            Icosaedro cubo = new Icosaedro(i/*+(numero*4)*/,arista,colorSelected);
            //arrayList.add(new Icosaedro(i+(numero*4),arista,colorSelected));
            arrayList.add(cubo);
            cuboListRojo.add(cubo);


        }
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del Icosaedro "+AMARILLO/*(i+(numero*4))*/);
            System.out.println("Introduce la medida de la arista:");
            double arista = sc.nextDouble();
            String colorSelected=AMARILLO;
            //System.out.println("El color seleccionado es :"+ colorSelected);
            Icosaedro cubo = new Icosaedro(i+(numero*2),arista,colorSelected);
            //arrayList.add(new Icosaedro(i+(numero*4),arista,colorSelected));
            arrayList.add(cubo);
            cuboListAmarillo.add(cubo);


        }
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del Icosaedro "+AZUL/*(i+(numero*4))*/);
            System.out.println("Introduce la medida de la arista:");
            double arista = sc.nextDouble();
            String colorSelected=AZUL;
            //System.out.println("El color seleccionado es :"+ colorSelected);
            Icosaedro cubo = new Icosaedro(i+(numero*3),arista,colorSelected);
            //arrayList.add(new Icosaedro(i+(numero*4),arista,colorSelected));
            arrayList.add(cubo);
            cuboListAzul.add(cubo);


        }
        mapColoresPoliedro.put(ROJO,cuboListRojo);
        mapColoresPoliedro.put(AMARILLO,cuboListAmarillo);
        mapColoresPoliedro.put(AZUL,cuboListAzul);


    }

   /* private static void agregarDodecaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Dodecaedro> dodecaedroList = new ArrayList<>();
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del Dodecaedro "+(i+(numero*3)));
            System.out.println("Introduce la medida de la arista:");
            double arista = sc.nextDouble();
            String colorSelected=seleccionarColor();
            System.out.println("El color seleccionado es :"+ colorSelected);
            Dodecaedro dodecaedro = new Dodecaedro(i+(numero*3),arista,colorSelected);

            // arrayList.add(new Dodecaedro(i+(numero*3),arista,colorSelected));
            arrayList.add(dodecaedro);
            dodecaedroList.add(dodecaedro);

        }
        mapPoliedro.put(DODEACAEDROOS,dodecaedroList);
    }

    private static void agregarOctaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Octaedro> octaedroList = new ArrayList<>();
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del Octaedro "+(i+(numero*2)));
            System.out.println("Introduce la medida de la arista:");
            double arista = sc.nextDouble();
            String colorSelected=seleccionarColor();
            System.out.println("El color seleccionado es :"+ colorSelected);
            //arrayList.add(new Octaedro(i+(numero*2),arista,colorSelected));
            Octaedro octaedro = new Octaedro(i+(numero*2),arista,colorSelected);
            arrayList.add(octaedro);
            octaedroList.add(octaedro);



        }
        mapPoliedro.put(OCTAEDROOS,octaedroList);
    }

    private static void agregarHexaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Hexaedro> hexaedroList = new ArrayList<>();
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del Hexaedro "+(i+numero));
            System.out.println("Introduce la medida de la arista:");
            double arista = sc.nextDouble();
            String colorSelected=seleccionarColor();
            System.out.println("El color seleccionado es :"+ colorSelected);
            //arrayList.add(new Hexaedro(i+numero,arista,colorSelected));
            Hexaedro hexaedro = new Hexaedro(i+numero,arista,colorSelected);
            arrayList.add(hexaedro);
            hexaedroList.add(hexaedro);


        }
        mapPoliedro.put(HEXAEDROOS,hexaedroList);
    }

    private static void agregarTetaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Tetaedro> tetaedroList = new ArrayList<>();
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos de la Tetraedro "+i);
            System.out.println("Introduce el arista:");
            double radio = sc.nextDouble();
            String colorSelected=seleccionarColor();
            System.out.println("El color seleccionado es :"+ colorSelected);
            //arrayList.add(new Tetaedro(i,radio,colorSelected));
            Tetaedro tetaedro = new Tetaedro(i,radio,colorSelected);
            arrayList.add(tetaedro);
            tetaedroList.add(tetaedro);

        }
        mapPoliedro.put(TETAEDROOS,tetaedroList);
    }

    public static String seleccionarColor(){
        System.out.println("Selecciona un color, elige el numero del color:");
        System.out.println("1.-Black");
        System.out.println("2.-White");
        System.out.println("3.-Red");
        System.out.println("4.-Blue");
        System.out.println("5.-Yellow");
        System.out.println("Si seleccionas otro color se seleccionara Grey");
        Scanner scan = new Scanner(System.in);
        int numero= scan.nextInt();

        String color;
        switch (numero){

            case 1: color="Black";
                break;
            case 2:color="White";
                break;
            case 3: color="Red";
                break;
            case 4:color="Blue";
                break;
            case 5:color="Yellow";
                break;
            default:
                System.out.println("Seleccion de color incorrecto");
                System.out.println("Auto sellecion de color 'GREY'");
                color="Grey";
                break;
        }
        return color;
    }*/
}
