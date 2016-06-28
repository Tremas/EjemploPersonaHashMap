package poliedros;



import javax.swing.*;
import java.util.*;

/**
 * Created by professor on 16/06/2016.
 */// crear un nuevo main que se llme "MapColores"  que la key de hash map
public class ProgramaPrincipal {
    public static final String OCTAEDROOS = "Octaedros";
    public static final String DODEACAEDROOS = "Dodeacaedros";
    public static final String HEXAEDROOS = "Hexaedros";
    public static final String TETAEDROOS = "Tetaedros";
    public static final String CUBOS = "Cubos";
    private static Map<String,List<? extends Poliedro>> mapPoliedro = new HashMap<>();

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<Poliedro> arrayList = new ArrayList<>();
        System.out.println("Introduce el numero de  poliedros para cada tipo:  ");
        int numero = sc.nextInt();




        agregarTetaedro(sc, arrayList, numero);

        agregarHexaedro(sc, arrayList, numero);
        agregarOctaedro(sc, arrayList, numero);
        agregarDodecaedro(sc, arrayList, numero);
        agregarIcosaedro(sc, arrayList, numero);
        ProcessarPoliedros(arrayList, numero);

       mapPoliedro();
        tipoMapPoliedro(OCTAEDROOS);
        //(CUBOS);
    }
    private static void tipoMapPoliedro(String tipoPoliedro){
        List<Poliedro> poliedroList = (List<Poliedro>) mapPoliedro.get(tipoPoliedro);
        System.out.println("La lista de "+tipoPoliedro+" es: ");
        System.out.println(poliedroList);
    }

    private static void mapPoliedro() {
        System.out.println("Map de Poliedros:");
        //System.out.println(mapPoliedro);
        //System.out.println(OCTAEDROOS+": "+mapPoliedro.get(OCTAEDROOS));
        List<Icosaedro> cubolist= (List<Icosaedro>) mapPoliedro.get(OCTAEDROOS);

        /*for (Icosaedro icosaedro: cubolist) {
            cubolist.get(1).getColor();
        }*/
        /*for (int i=0; i<cubolist.size(); i++) {

               System.out.println("cubo:"+i+" "+cubolist.get(i).getColor());

        }*/


        //System.out.println("Color: "+mapPoliedro.getOrDefault(OCTAEDROOS,));
    }

    private static void ProcessarPoliedros(List<Poliedro> arrayList, int numero) {
        MaxPoliedro(arrayList);

        MinPoliedro(arrayList);

        mediaVolumen(arrayList, numero);
        DiagonalHexaedro(arrayList);
        contadorVolumen(arrayList);
        ContadorColor(arrayList);

    }

    private static void ContadorColor(List<Poliedro> arrayList) {
        int colorBlack =0;
        int colorWhite =0;
        int colorRed =0;
        int colorBlue =0;
        int colorYellow =0;
        int colorGrey =0;
        for(Poliedro poliedro : arrayList){
            if(poliedro.getColor().equals("Black")){colorBlack++;}
            if(poliedro.getColor().equals("White")){colorWhite++;}
            if(poliedro.getColor().equals("Red")){colorRed++;}
            if(poliedro.getColor().equals("Blue")){colorBlue++;}
            if(poliedro.getColor().equals("Yellow")){colorYellow++;}
            if(poliedro.getColor().equals("Grey")){colorGrey++;}
        }
        System.out.println("El numero total de poliedros con color Black es: "+colorBlack);
        System.out.println("El numero total de poliedros con color White es: "+colorWhite);
        System.out.println("El numero total de poliedros con color Red es: "+colorRed);
        System.out.println("El numero total de poliedros con color Blue es: "+colorBlue);
        System.out.println("El numero total de poliedros con color Yellow es: "+colorYellow);
        System.out.println("El numero total de poliedros con color Grey es: "+colorGrey);
    }

    private static void contadorVolumen(List<Poliedro> arrayList) {
        int countMenor20=0;
        int count20Entre100=0;
        int countMas100=0;
        for(Poliedro poliedro: arrayList){
            if(poliedro.calculaVolumen()<20){countMenor20+=1;}
            else if(poliedro.calculaVolumen()>20 && poliedro.calculaVolumen()<100){count20Entre100+=1;}
            else{countMas100+=1;}
        }

        System.out.println("EL numero de poliedros con un volumen menor de 20 es :"+countMenor20);
        System.out.println("EL numero de poliedros con un volumen entre 20 y 100 es :"+count20Entre100);
        System.out.println("EL numero de poliedros con un volumen mayor de 100 es :"+countMas100);
    }

    private static void DiagonalHexaedro(List<Poliedro> arrayList) {
        for(Poliedro poliedro: arrayList){

            if(poliedro instanceof Hexaedro){

                Hexaedro hexaedro=(Hexaedro) poliedro;
                System.out.println("La diagonal del Hexadro: "+hexaedro.Diagonal());
                // selecciono de la clase super(figuraGeometrica) i definimos que es circumferencia

            }
        }
    }

    private static void mediaVolumen(List<Poliedro> arrayList, int numero) {
        double totalVolumen=0.0;
        for(Poliedro poliedro: arrayList){

            double VolumenActual = poliedro.calculaVolumen();
            totalVolumen+=VolumenActual;


        }
        double mediaVolumen=totalVolumen/(numero*4);
        System.out.println("La media total de los volumenes es :" + mediaVolumen);
    }

    private static void MinPoliedro(List<Poliedro> arrayList) {
        Poliedro min= Collections.min(arrayList);
        System.out.println("El volumen min de los poliedro con la id : " +min.getId()+" con un volumen de : "+ min.calculaVolumen());
    }

    private static void MaxPoliedro(List<Poliedro> arrayList) {
        Poliedro max = Collections.max(arrayList);
        System.out.println("El volumen maximo de los poliedro con la id : " +max.getId()+" con un volumen de : "+ max.calculaVolumen());
    }

    private static void agregarIcosaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Icosaedro> cuboList = new ArrayList<>();
        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del Icosaedro "+(i+(numero*4)));
            System.out.println("Introduce la medida de la arista:");
            double arista = sc.nextDouble();
            String colorSelected=seleccionarColor();
            System.out.println("El color seleccionado es :"+ colorSelected);
            Icosaedro cubo = new Icosaedro(i+(numero*4),arista,colorSelected);
            //arrayList.add(new Icosaedro(i+(numero*4),arista,colorSelected));
            arrayList.add(cubo);
            cuboList.add(cubo);


        }
        mapPoliedro.put(CUBOS,cuboList);
    }

    private static void agregarDodecaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
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
    }

}