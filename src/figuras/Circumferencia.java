package figuras;

/**
 * Created by professor on 13/06/2016.
 */
public class Circumferencia extends FiguraGeometrica {

    private double radio;

    public Circumferencia(long id, double radio) {
        super(id);
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
        return (Math.PI * (Math.pow(radio, 2)));
    }


    public double calculaPerimetro() {
        return (2 * Math.PI * radio);
    }
    public double calcularDiametro(){return radio*2;}

//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<FiguraGeometrica> arrayList = new ArrayList<>();
//        System.out.println("Introduce el numero de  circumferencias:  ");
//        int numero =sc.nextInt();
//
//
//        for(int i=0; i<numero; i++)
//
//        {
//            System.out.println("Introduce los datos de la circumferencia "+i);
//            System.out.println("Introduce el radio:");
//           double radio = sc.nextDouble();
//
//            arrayList.add(new Circumferencia(radio,i));
//
//            //arrayList.add(new Rectangulo(2,2/*radio*/));
//
//        }
//
//
//        for(FiguraGeometrica figuraGeometrica : arrayList) // recorremos el array
//        {
//           // Collection<FiguraGeometrica> coleccio = arrayList;
//
//            System.out.println("El area de la figura geometica " + "es= "+figuraGeometrica.calculaArea());
//            System.out.println("El perimetro de la figura geometica " + "es ="+figuraGeometrica.calculaPerimetro());
//
//           //
//           // System.out.println("Max area/: " + Collections<>.max(arrayList,null));
//        }
//
//
//    }

    @Override
    public int compareTo(FiguraGeometrica figuraGeometrica) {
        return super.compareTo(figuraGeometrica);
    }

    @Override
    public String toString() {
        return "Circumferencia{" +
                "id=" + id +
                "radio="+radio+
                '}';
    }
}