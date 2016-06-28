package figuras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by professor on 14/06/2016.
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<FiguraGeometrica> arrayList = new ArrayList<>();
        System.out.println("Introduce el numero de  figuras geometricas para cada tipo:  ");
        int numero = sc.nextInt();


        IntroducirCirumferencia(sc, arrayList, numero);
        AgregarRectangulo(sc, arrayList, numero);
        agregarTriangulo(sc, arrayList, numero);

        FiguraGeometrica max1= null;
        double totalArea=0.0;
        for(FiguraGeometrica figuraGeometrica : arrayList) // recorremos el array
        {
            double areaActual = figuraGeometrica.calculaArea();
            double perimetro = figuraGeometrica.calculaPerimetro();

            System.out.println("El area de la figura geometrica "  + " es = " +areaActual);
            System.out.println("El perimetro de la figura geometrica "  + " es =" +perimetro);
            if(max1==null){
                max1=figuraGeometrica;
            }else{
                areaActual = figuraGeometrica.calculaArea();
                if(areaActual> max1.calculaArea()){
                    max1=figuraGeometrica;
                }
            }
            totalArea=totalArea+areaActual;
            if(figuraGeometrica instanceof  Circumferencia){

                Circumferencia circumferencia=(Circumferencia)figuraGeometrica;
                System.out.println("El diametro es: "+circumferencia.calcularDiametro());
                // selecciono de la clase super(figuraGeometrica) i definimos que es circumferencia

            }

        }
        System.out.println("<Rudimentario>La figura geometrica de  area maxima es: " + max1.calculaArea() );
        FiguraGeometrica max = Collections.max(arrayList);

        System.out.println("<Colection>La figura geometrica de  area maxima es: " + max.calculaArea() );
        Collections.sort(arrayList);
        System.out.println("La lista ordenada  es: " + arrayList);
        System.out.println("L'area total de las figuras es: "+ totalArea);
        System.out.println("La media del area total de les figures es: "+ totalArea/(numero*3));





    }

    private static void agregarTriangulo(Scanner sc, List<FiguraGeometrica> arrayList, int numero) {
        for(int i=0; i<numero; i++)
        {
            System.out.println("Introduce los datos del triangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();

            Triangulo triangulo = new Triangulo(i+numero+numero,base,altura);
            arrayList.add(triangulo);
        }
    }

    private static void AgregarRectangulo(Scanner sc, List<FiguraGeometrica> arrayList, int numero) {
        for(int i=0; i<numero; i++)
        {
            System.out.println("Introduce los datos del rectangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();

            Rectangulo rectangulo = new Rectangulo(i+numero,base,altura);
            arrayList.add(rectangulo);
        }
    }

    private static void IntroducirCirumferencia(Scanner sc, List<FiguraGeometrica> arrayList, int numero) {
        for(int i=0; i<numero; i++)

        {
            System.out.println("Introduce los datos de la circumferencia "+i);
            System.out.println("Introduce el radio:");
            double radio = sc.nextDouble();

            arrayList.add(new Circumferencia(i,radio));


        }
    }
}
